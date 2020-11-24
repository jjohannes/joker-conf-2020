plugins {
    id("com.example.spring-boot-application")
}

dependencies {
    implementation("com.example.myproduct:table")

    implementation("org.apache.juneau:juneau-marshall:8.2.0")
}
