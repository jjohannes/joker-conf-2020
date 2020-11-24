includeBuild("../build-logic")

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

includeBuild("../user-feature")
includeBuild("../domain-model")

include("app")