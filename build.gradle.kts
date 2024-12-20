plugins {
    id("io.github.kelvindev15.npm-gradle-plugin") version "3.2.8"
}

packageJson {
    name = "my-app"
    version = "1.0.0"
    description = "My App"
    main = "index.js"
    scripts {
        script("start" runs "node build/js/packages/my-app/kotlin/my-app.js")
    }
    dependencies {
        "react" version "19.0.0"
        "react-dom" version "19.0.0"
        "@zucchero-sintattico/events".version("9.3.0")
    }
}