plugins {
    `version-catalog`
    `maven-publish`
}

catalog {
    versionCatalog {
        from(files("gradle/libs.versions.toml"))
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.github.cren90"
            artifactId = "android-versions"
            version = "0.0.1"
            from(components["versionCatalog"])
            pom {
                name.set("Android Versions")
                description.set("Catalog for commonly used android dependencies.")
                url.set("https://github.com/cren90/android-versions")
                licenses {
                    license {
                        name.set("The Apache License, Version 2.0")
                        url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                    }
                }
                developers {
                    developer {
                        id.set("cren90")
                        name.set("Chris Renfrow")
                    }
                }
                scm {
                    // version control meta data
                    connection.set("scm:git@github.com:cren90/android-versions.git")
                    developerConnection.set("scm:git@github.com:cren90/android-versions.git")
                    url.set("https://github.com/cren90/android-versions")
                }
            }
        }
    }
}