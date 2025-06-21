plugins {
    `kotlin-dsl`
}

kotlin {
    jvmToolchain(libs.versions.java.compile.toolchain.get().toInt())
}

dependencies {
    implementation(libs.kotlin.gradle.plugin)
    implementation(libs.detektGradlePlugin)
}
