plugins {
    kotlin("jvm")
    id("org.openapi.generator") version "7.7.0"
}

sourceSets {
    main {
        java.srcDir(layout.buildDirectory.dir("generate-resources/main/src/main/kotlin"))
    }
}

openApiGenerate {
    val openApiGroup = "${rootProject.group}.transport"
    generatorName.set("kotlin")
    packageName.set(openApiGroup)
    apiPackage.set("$openApiGroup.api")
    modelPackage.set("$openApiGroup.models")
    invokerPackage.set("$openApiGroup.invoker")
    inputSpec.set("$rootDir/specs/spec-suit-api-product.yaml")

    globalProperties.apply {
        put("models", "")
        put("modelDocs", "false")
    }

    configOptions.set(
        mapOf(
            "dateLibrary" to "string",
            "enumPropertyNaming" to "UPPERCASE",
            "collectionType" to "list",
            "serializationLibrary" to "kotlinx_serialization"
        )
    )

    typeMappings.set(
        mapOf(
            "number" to "Double"
        )
    )
}

tasks {
    compileKotlin {
        dependsOn(openApiGenerate)
    }
}