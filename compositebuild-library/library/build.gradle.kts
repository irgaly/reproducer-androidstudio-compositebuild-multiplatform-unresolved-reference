
plugins {
    kotlin("multiplatform")
    id("com.android.library")
}

android {
    namespace = "net.irgaly.composite"
    compileSdk = 33
}

kotlin {
    android()
    ios()
    sourceSets {
        commonMain {
            dependencies {
                implementation(project(":core"))
            }
        }
    }
}
