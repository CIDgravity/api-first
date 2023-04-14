#!/bin/sh
#
./jsonschema2pojo-1.1.2/bin/jsonschema2pojo -s src/main/resources/kong_json_schema.json -t src/main/java -d  "" -b -p com.cidgravity.kong.generated -il NON_EMPTY
# Add RegisterForReflection to allow quarkus to serialize the objects to JSON
find src/main/java/com/cidgravity/kong/generated/ -type f | xargs sed -i '/public class/i @io.quarkus.runtime.annotations.RegisterForReflection'
