includeBuild("../build-logic")

includeBuild("../domain-model")
dependencyResolutionManagement {
    repositories { mavenCentral() }
}

include("data", "table")