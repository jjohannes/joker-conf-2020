plugins {
    id("org.jetbrains.kotlin.jvm")
    id("java-library")
}

group = "com.example.myproduct"

tasks.compileKotlin {
    kotlinOptions.jvmTarget = "11"
}
