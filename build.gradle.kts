buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath(libs.agp)
        classpath(libs.kotlin.gradlePlugin)
//        classpath "com.android.tools.build:gradle:7.2.2"
//        classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.0"
    }
}

allprojects {
    extensions.extraProperties.set("minSdk", 21)
    extensions.extraProperties.set("targetSdk", 32)
    extensions.extraProperties.set("compileSdk", 32)
    extensions.extraProperties.set("buildToolsVersion", "32.0.0")
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}