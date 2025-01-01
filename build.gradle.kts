ext {
    val versionCode by extra(1)
    val versionName by extra("1.0")
    val compileSdk by extra(35)
    val minSdk by extra(28)
    val jvmTarget by extra("1.8")
    val sourceCompatibility by extra(JavaVersion.VERSION_1_8)
    val targetCompatibility by extra(JavaVersion.VERSION_1_8)
}
//JavaVersion.VERSION_11
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    alias(libs.plugins.android.library) apply false
}