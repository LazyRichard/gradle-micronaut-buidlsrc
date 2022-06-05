import org.gradle.accessors.dm.LibrariesForLibs

plugins {
    id("com.example.java-common-conventions")

    id("io.micronaut.library")
}

val libs = the<LibrariesForLibs>()

micronaut {
    processing {
        incremental(true)

        annotations("com.example.*")
    }
}
