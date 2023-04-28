plugins {
    id("java")
}

group = "me.kleidukos"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://eldonexus.de/repository/maven-public")
}

var sadu_version = "1.3.0"

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.2")

    //sadu
    implementation("de.chojo.sadu", "sadu-postgres", sadu_version)
    implementation("de.chojo.sadu", "sadu-queries", sadu_version)
    implementation("de.chojo.sadu", "sadu-datasource", sadu_version)
    implementation("de.chojo.sadu", "sadu-updater", sadu_version)
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}