
val picoCliVersion = "4.7.6"
val slf4jVersion = "1.7.36"
val log4jVersion = "2.23.1"
val junitVersion = "5.10.0"

plugins {
    id("hu.bme.mit.ase.shingler.gradle.java")
}

dependencies {
    implementation(libs.picocli)
    implementation(libs.slf4j.api)
    implementation(libs.slf4j.log4j.impl)
    implementation(libs.slf4j.logback.impl)
    implementation(libs.junit.jupiter.core)
    implementation(libs.junit.jupiter.engine)
}