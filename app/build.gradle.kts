plugins {
    id("com.android.application")
}

android {
    namespace = "net.irgaly.reproducercompositebuild"
    compileSdk = 33
}

dependencies {
    implementation("compositebuild-library:library")
}
