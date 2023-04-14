# api Project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Kong JSON Schema

We use version [v1.16.1](https://github.com/Kong/deck/blob/v1.16.1/file/kong_json_schema.json) of Kong because of the
new `consumer_groups` option in deck v1.17 that is a proprietary feature.

If you update kong, re-download the associated `kong_json_schema.json` file and paste it
in `src/main/resources/kong_json_schema.json`.

Then run the script `./generate-kong-pojo.sh` manually to regenerate the associated POJO files.

Finally edit `./src/main/kotlin/com/cidgravity/kong/KongApi.kt` with the feature of the new schema.

## OpenAPI Schema

We produce three types of OpenAPI schemas:

- public api: contains all the endpoints that will be accessible by users via apikey. Aimed to be consumed by `redocly`.
- frontend api: contains all the endpoints that will be accessible via our webapp via oauth2
- internal api: one OpenAPI doc for each service. If protected by apikey, the api-gateway (kong) will take care of it so
  the corresponding security definition is stripped. If protected by oauth2, kong just proxy the request without apply
  auth, therefore the security defintion is kept.

The public API is generated from all the `IService` that have `isPublic = true`.
By default, every service is private.

The frontend API is generated from all the `IService` that have `isExposedToFrontend = true`.
By default, every service protected by oauth2 is exposed to frontend.

## Add a new endpoint/service

You don't need to add much code.

Take example on any `IService` such as `SomeService`.

Create a new `object` if you want to create a new Service.

Override the necessary methods and params.

/!\ Don't forget to add your new service in the `ALL_SERVICES` variable in `IService` or it will be ignored. /!\

## Code formatting

We use [./eclipse-format.xml](./eclipse-format.xml) and [./eclipse.importorder](./eclipse.importorder).

Configure IntelliJ to use this by
installing [Adapter for Eclipse Code Formatter](https://plugins.jetbrains.com/plugin/6546-adapter-for-eclipse-code-formatter)
plugin.

## Running the code

Dev:

```bash
quarkus dev
```

then `e` then choose the command `generate` for example.

If there is a bug, you can turn on debug logs by changing `quarkus.log.level` from `OFF` to `DEBUG`.

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:

```shell script
./gradlew quarkusDev
```

You can also use `quarkus dev` if you downloaded the quarkus CLI.

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:

```shell script
./gradlew build
```

It produces the `quarkus-run.jar` file in the `build/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `build/quarkus-app/lib/` directory.

The application is now runnable using `java -jar build/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:

```shell script
./gradlew build -Dquarkus.package.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar build/*-runner.jar`.

## Creating a native executable

You can create a native executable using:

```shell script
./gradlew build -Dquarkus.package.type=native
```

You can also use:

```shell script
./quarkus build --native
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using:

```shell script
./gradlew build -Dquarkus.package.type=native -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./build/openapi-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/gradle-tooling.

## Generate files

From the .jar:
```bash
cd output; java -jar ../build/quarkus-app/quarkus-run.jar generate
```

Or to both build and generate files, simply run:
```
make
````

## Related Guides

- Picocli ([guide](https://quarkus.io/guides/picocli)): Develop command line applications with Picocli
- Kotlin ([guide](https://quarkus.io/guides/kotlin)): Write your services in Kotlin
