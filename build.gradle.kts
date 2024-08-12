plugins {
    kotlin("jvm") apply false
}

group = "ru.suit"
version = "0.0.1"

subprojects {
    group = rootProject.group
    version = rootProject.version
    repositories {
        mavenCentral()
    }
}
