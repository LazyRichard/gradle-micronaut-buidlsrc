plugins {
    id("onsil.java-micronaut-application-conventions")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":onsil.gatherer"))

    runtimeOnly("ch.qos.logback:logback-classic")
    compileOnly("org.graalvm.nativeimage:svm")
}

application {
    mainClass.set("com.example.application.Application")
}

graalvmNative {
    toolchainDetection.set(false)

    binaries {
        val main by getting {
            buildArgs.add("--verbose")
        }
    }
}
