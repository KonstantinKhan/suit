plugins {
    kotlin("jvm")
    id("org.openapi.generator") version "7.7.0"
}

openApiGenerate {
    val openApiGroup = "${rootProject.group}.transport"
    generatorName.set("kotlin")
    outputDir.set("${buildFile.parent}/generated")
    packageName.set(openApiGroup)
    apiPackage.set("$openApiGroup.api")
    modelPackage.set("$openApiGroup.invoker")
    invokerPackage.set("$openApiGroup.invoker")
    inputSpec.set("$rootDir/specs/spec-suit-api.yaml")

    globalProperties.apply {
        put("models", "")
        put("modelDocs", "false")
    }

    configOptions.set(
        mapOf(
            "dateLibrary" to "string",
            "enumPropertyNaming" to "UPPERCASE",
            "collectionType" to "list"
        )
    )
}

tasks {
    withType(org.jetbrains.kotlin.gradle.tasks.KotlinCompile::class.java).forEach {
        it.dependsOn(openApiGenerate)
    }
}