includeBuild("../build-logic")

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}
includeBuild("../domain-model")

include("table")
include("data")
