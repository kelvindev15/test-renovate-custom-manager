plugins {
    id("io.github.kelvindev15.npm-gradle-plugin") version "3.1.0"
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
        "react" version "17.0.2"
        "react-dom" version "17.0.2"
        "@zucchero-sintattico/events".version("8.1.1")
    }
}