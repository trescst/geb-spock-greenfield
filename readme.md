[![Build Status](https://drone.io/github.com/geb/geb-example-gradle/status.png)](https://drone.io/github.com/geb/geb-example-gradle/latest)

# Description

This is an example of incorporating Geb into a Gradle build. It also shows the use of Spock in order to run function tests.

The build is setup to work with Firefox, Chrome and PhantomJS. Have a look at the `build.gradle` and the `src/test/resources/GebConfig.groovy` files.

**PhantomJS seems to be unstable for the moment, while FireFox and Chrome test run fine, PhantomJS reports an unexpected error.**

# Usage

The following commands will launch the tests with the individual browsers:
    
    ./gradlew chromeTest
    ./gradlew firefoxTest
    ./gradlew phantomJsTest

To run with all, you can run:

    ./gradlew test

Replace `./gradlew` with `gradlew.bat` in the above examples if you're on Windows.
