plugins {
    kotlin("jvm")
}

dependencies {
    implementation(project(":suit-food-common-be"))

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}