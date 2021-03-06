
description = "Kotlin Ant Tools"

plugins {
    kotlin("jvm")
}

dependencies {
    compile(commonDep("org.apache.ant", "ant"))
    compile(project(":kotlin-preloader"))
    compile(project(":kotlin-stdlib"))
}

sourceSets {
    "main" { projectDefault() }
    "test" {}
}

runtimeJar {
    manifest.attributes.put("Class-Path", "kotlin-stdlib.jar kotlin-reflect.jar kotlin-script-runtime.jar kotlin-preloader.jar")
}

dist()

