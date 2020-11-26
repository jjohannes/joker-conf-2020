includeBuild("../build-logic")

includeBuild("../user-feature")
includeBuild("../domain-model")
dependencyResolutionManagement {
    repositories { mavenCentral() }
}

include("app")