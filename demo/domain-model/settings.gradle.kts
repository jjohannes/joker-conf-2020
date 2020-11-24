includeBuild("../build-logic")

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

include("release") // a project for data classes that represent software releases
