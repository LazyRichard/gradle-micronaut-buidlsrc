import org.gradle.accessors.dm.LibrariesForLibs

plugins {
    id("com.example.java-common-conventions")

    id("io.micronaut.application")
}

val libs = the<LibrariesForLibs>()

micronaut {
    runtime("netty")
    testRuntime("junit5")
    processing {
        incremental(true)
        annotations("com.example.*")
    }
}
