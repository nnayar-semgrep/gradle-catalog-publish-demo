plugins {
    `common-config`
    `nexus-config`
}

allprojects {
    dependencyLocking {
        lockAllConfigurations()
    }
}
