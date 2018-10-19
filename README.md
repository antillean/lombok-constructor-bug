# lombok-constructor-bug

This repo demonstrates a bug where lombok 1.18.2 (and all previously tested versions, which were up to v1.16.18) doesn't properly allow for the mixing of `@Data`, `@Builder` and constructor annotations.

1. Clone the repository
2. Build and run it. Some options:
    - Open it in IntelliJ or Eclipse as a Gradle or Maven project and run it from there.
    - `mvn clean install`
    - `./gradlew clean build` (might not work on some versions of Lombok and Gradle due to [Lombok issue 1716](https://github.com/rzwitserloot/lombok/issues/1716)).
