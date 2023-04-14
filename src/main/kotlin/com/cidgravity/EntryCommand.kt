package com.cidgravity

import com.cidgravity.config.Configuration
import com.cidgravity.gateway.KongApi
import com.cidgravity.gateway.writeToYamlFile
import com.cidgravity.openapi.FrontendApi
import com.cidgravity.openapi.PublicApi
import com.cidgravity.openapi.shared.writeToYamlFile
import com.cidgravity.service.ALL_SERVICES
import com.cidgravity.service.IService
import io.quarkus.picocli.runtime.annotations.TopCommand
import picocli.CommandLine
import picocli.CommandLine.Command
import picocli.CommandLine.Parameters


// TODO: output JSON instead of printing raw text
@TopCommand
@Command(
    version = ["use 'version' command instead"],
    mixinStandardHelpOptions = true,
    subcommands = [GenerateCommand::class, VersionCommand::class, ServicesCommand::class]
)
class EntryCommand {
}

// ignore the -v or --version option
// it cannot take the application.properties version easily, so I dumped it
// mixinStandardHelpOptions = true contains both usage and version... so i need to stick with the option version
// to get the generated usage...
@Command(name = "version", description = ["Print version"])
class VersionCommand : Runnable {
    override fun run() {
        println("${Configuration.NAME} version ${Configuration.VERSION}")
    }
}

//@Command(helpCommand = true, name = "help", description = ["Print this help message"])
//class HelpCommand: Runnable {
//    override fun run() {
//        val cmd = CommandLine(EntryCommand())
//        cmd.usage(cmd.out)
//    }
//}

@Command(name = "services", description = ["List all existing services"])
class ServicesCommand : Runnable {
    @CommandLine.Option(names = ["-p", "--public"], description = ["Only output public service"], negatable = true)
    var showPublicOnly = false

    override fun run() {
        val requestedServices =
            if (showPublicOnly) ALL_SERVICES.filter { service -> service.hasPublicEndpoints() } else ALL_SERVICES
        requestedServices.forEach { service ->
            (
                    if (service.hasPublicEndpoints()) {
                        println("${service.id} (public)")
                    } else {
                        println(service.id)
                    }
                    )
        }
    }
}

@Command(name = "generate", description = ["Generate openapi description documents"])
class GenerateCommand : Runnable {
    @Parameters(paramLabel = "<name>", defaultValue = "all", description = ["Service name"])
    var name: String? = null

    fun generatePublicApi() {
        when (val openapi = PublicApi.get()) {
            null -> println("No services are exposed to the public: no public openapi is generated")
            else -> openapi.writeToYamlFile("openapi-public")
        }
    }

    //fun generateGatewayApi(service: IService) {
    //    service.getApi(withSecurity = SecurityEnum.GATEWAY)
    //        .writeToYamlFile("openapi-gateway-${service.id}")
    //}

    //fun generateGatewayApi() {
    //    ALL_SERVICES.forEach { service -> generateGatewayApi(service) }
    //}

    fun generateKongApi() {
        val kongApi = KongApi.get()
        kongApi.writeToYamlFile("kong")
    }

    fun generateInternalApi(service: IService) {
        service.getApi()
            .writeToYamlFile("openapi-internal-${service.id}")
    }

    fun generateInternalApis() {
        ALL_SERVICES.forEach { service -> generateInternalApi(service) }
    }

    fun generateFrontendApi() {
        when (val openapi = FrontendApi.get()) {
            null -> println("No services are exposed to frontend:  no frontend openapi is generated")
            else -> openapi.writeToYamlFile("openapi-frontend")
        }
    }

    fun generateAllApi() {
        generatePublicApi()
        generateKongApi()
        generateInternalApis()
        generateFrontendApi()
    }

    override fun run() {
        when (name) {
            "all" -> generateAllApi()
            "public" -> generatePublicApi()
            //"kong","gateway","api-gateway" -> generateGatewayApis()
            "kong", "gateway", "api-gateway" -> generateKongApi()
            "frontend", "front" -> generateFrontendApi()
            else -> {
                val associatedService = ALL_SERVICES.find { service -> service.id == name }
                when (associatedService != null) {
                    true -> generateInternalApi(associatedService)
                    false -> println(
                        "Error: the provided service name does not exist. " +
                                "Use `cidg-api services` to list all existing services."
                    )
                }
            }
        }
    }
}
