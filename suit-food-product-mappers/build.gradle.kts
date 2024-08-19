plugins {
    kotlin("jvm")
}

val kotestVersion: String by project

dependencies {
    implementation(project(":suit-food-common-be"))
    implementation(project(":suit-food-product-be"))
    implementation(project(":suit-transport-openapi"))

    testImplementation ("io.kotest:kotest-runner-junit5:$kotestVersion")
    testImplementation ("io.kotest:kotest-assertions-core:$kotestVersion")
    testImplementation ("io.kotest:kotest-property:$kotestVersion")
}

tasks.withType<Test>().configureEach {
//    systemProperty("")
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(21)
}