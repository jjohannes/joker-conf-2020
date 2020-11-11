plugins {
    id("org.gradle.presentation.asciidoctor")
}

presentation {
    githubUserName.set("jjohannes")
    githubRepoName.set("joker-conf-2020")
}

dependencies {
    asciidoctor("org.asciidoctor:asciidoctorj-diagram:1.5.11")
}

tasks {
    asciidoctor {
        requires("asciidoctor-diagram")
    }
}