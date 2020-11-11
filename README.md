# Keeping growing software projects under control with Gradle

[Talk at Joker Java Conference 2020](https://jokerconf.com/en/2020/talks/4knxxtjfpo0jbjndlcxkb9/)

Gradle is a widely used build tool for building Java, Kotlin, Groovy or Scala projects.
But, with language-agnostic systems for dependency management and work scheduling at its core, it can be used to automate the build process for any kind of software product.
Furthermore, it can do this very effectively by providing various caching mechanisms that also work in a language-agnostic way.
This makes Gradle a powerful tool to structure and build growing software projects.
And, if used correctly, profit from all the optimisations, like incremental and cached builds, even for custom build logic.

The challenge though is to understand which features of Gradle to use when and for what.
As Gradle itself evolved, many good things have been added in recent Gradle releases which are not as widely known yet.

This talk will show, on a practical example, how Gradle helps you to deal with challenges you typically encounter in growing software projects.

## Sample

The demo in this talk is following this Gradle sample: [Structuring Software Projects Sample](https://docs.gradle.org/nightly/samples/sample_structuring_software_projects.html)