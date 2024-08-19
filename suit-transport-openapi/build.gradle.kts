plugins {
    kotlin("jvm")
//    kotlin("plugin.serialization") version "2.0.10"
    id("org.openapi.generator") version "7.7.0"
}

dependencies {
//    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.7.1")
    // https://mvnrepository.com/artifact/com.fasterxml.jackson.module/jackson-module-kotlin
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.17.2")

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
            "serializationLibrary" to "jackson"
        )
    )

    typeMappings.set(
        mapOf(
            "number" to "Double"
        )
    )

    languageSpecificPrimitives.set(listOf("Double"))
}

tasks {
    compileKotlin {
        dependsOn(openApiGenerate)
    }
}