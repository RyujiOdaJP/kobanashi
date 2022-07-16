pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "kobanashi"
include(":app")
include(":data:api")
include(":data:db")
include(":data:repository")
include(":common")
include(":features:post")
include(":features")
include(":models")
include(":data")
