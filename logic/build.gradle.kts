
plugins {
    id("hu.bme.mit.ase.shingler.gradle.java")
}

dependencies {

    //subproject dependency
    implementation(project(":lib"))

    implementation(libs.slf4j.api)
    implementation(libs.picocli)
    implementation(libs.slf4j.log4j.impl)
    implementation(libs.junit.jupiter.core)
    implementation(libs.junit.jupiter.engine)
}

