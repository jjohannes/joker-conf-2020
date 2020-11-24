plugins {
    id("java-library")
}

group = "com.example.myproduct"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
    }
}
