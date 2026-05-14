plugins {
    application
}

group = "impact.cli"
version = "1.0"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("info.picocli:picocli:4.7.7")
}

application {
    mainClass.set("impact.cli.App")
}

tasks.jar {
    manifest {
        attributes["Main-Class"] = "impact.cli.App"
    }
}
