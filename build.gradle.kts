plugins {
  kotlin("js") version "1.3.50"
}

kotlin {
  target {
    useCommonJs()
    nodejs()
  }

  sourceSets["main"].dependencies {
    implementation(kotlin("stdlib-js"))

    implementation(npm("left-pad", "1.3.0"))
    implementation(npm("socket.io"))
    implementation(npm("http"))
    implementation(npm("rxjs"))
    implementation(npm("zone.js", "0.9.1"))
    implementation(npm("@angular/common"))
    implementation(npm("@angular/core"))
//    implementation(npm("@types/node"))
  }
}

repositories {
  mavenLocal()
  jcenter()
}



































/// hidden part
repositories {
  maven(url = "https://dl.bintray.com/kotlin/kotlin-eap")
  maven(url = "https://dl.bintray.com/kotlin/kotlin-dev")
}
