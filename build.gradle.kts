//buildscript {
//    repositories {
//        mavenCentral()
//    }
//
//    dependencies {
//        classpath("org.jsonschema2pojo:jsonschema2pojo-gradle-plugin:1.1.2")
//    }
//}

plugins {
    kotlin("jvm") version "1.7.21"
    kotlin("plugin.allopen") version "1.7.21"
    id("io.quarkus")
    id("org.jsonschema2dataclass") version "5.0.0"
}

// TODO: this thing doesn't work.. it doesn't find source
// See https://github.com/jsonschema2dataclass/js2d-gradle/blob/main/docs/usage/basic_6.adoc
jsonSchema2Pojo {
    // Location of the JSON Schema file(s). This may refer to a single file or a directory of files.
    //source = files("${sourceSets.main.output.resourcesDir}/json")
    //propertyWordDelimiters = []
    executions {
        create("main") {
            source.setFrom(files("${projectDir}/src/resources/kong_json_schema.json"))
            propertyWordDelimiters.set("_")
            annotationStyle.set("gson")
            targetPackage.set("com.cidgravity.kong.generated")
            generateBuilders.set(true)
        }
    }
}


repositories {
    mavenCentral()
    mavenLocal()
}

val quarkusPlatformGroupId: String by project
val quarkusPlatformArtifactId: String by project
val quarkusPlatformVersion: String by project

dependencies {

    // jsonschema2dataclass
    //implementation("javax.validation:validation-api:2.0.1.Final")
    //implementation("com.fasterxml.jackson.core:jackson-databind:2.14.1")
    // see src/main/resources/json/external_dependencies.json
    //implementation("joda-time:joda-time:2.12.2")

    // generation of kong files
    // https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind
    implementation("com.fasterxml.jackson.core:jackson-databind:2.14.1")
    // https://mvnrepository.com/artifact/com.fasterxml.jackson.dataformat/jackson-dataformat-yaml
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:2.14.1")


    // https://mvnrepository.com/artifact/io.swagger.core.v3/swagger-core
    implementation("io.swagger.core.v3:swagger-core:2.2.7")

    implementation(enforcedPlatform("${quarkusPlatformGroupId}:${quarkusPlatformArtifactId}:${quarkusPlatformVersion}"))
    implementation("io.quarkus:quarkus-picocli")
    implementation("io.quarkus:quarkus-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("io.quarkus:quarkus-arc")
    testImplementation("io.quarkus:quarkus-junit5")
}

group = "com.cidgravity"
version = "1.0.0-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

tasks.withType<Test> {
    systemProperty("java.util.logging.manager", "org.jboss.logmanager.LogManager")
}
allOpen {
    annotation("javax.ws.rs.Path")
    annotation("javax.enterprise.context.ApplicationScoped")
    annotation("io.quarkus.test.junit.QuarkusTest")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = JavaVersion.VERSION_17.toString()
    kotlinOptions.javaParameters = true
}
