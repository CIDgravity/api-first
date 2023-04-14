all: generate

build:
	./gradlew build

test:
	./gradlew test

dev:
	./gradlew quarkusDev

generate: build
	cd output; java -jar ../build/quarkus-app/quarkus-run.jar generate

.PHONY: build generate test dev
