plugins {
    kotlin("jvm")
}

dependencies {
    implementation(project(":suit-food-product-be"))
    implementation(project(":suit-transport-openapi"))

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}