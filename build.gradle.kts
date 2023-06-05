import com.bagusmerta.reuzable.ConfigData

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
    extensions.extraProperties.set("minSdk", ConfigData.minSdk)
    extensions.extraProperties.set("targetSdk", ConfigData.targetSdk)
    extensions.extraProperties.set("compileSdk", ConfigData.compileSdk)
    extensions.extraProperties.set("buildToolsVersion", "32.0.0")
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}