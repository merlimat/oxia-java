# Oxia Client Java

[![Build](https://github.com/streamnative/oxia-client-java/actions/workflows/pr-build-and-test.yml/badge.svg)](https://github.com/streamnative/oxia-client-java/actions/workflows/pr-build-and-test.yml)

## Build

Requirements:

* JDK 17
* Maven 3.8.6+

Common build actions:

|             Action              |                 Command                  |
|---------------------------------|------------------------------------------|
| Full build and test             | `mvn clean verify`                       |
| Skip tests                      | `mvn clean verify -DskipTests`           |
| Skip Jacoco test coverage check | `mvn clean verify -Djacoco.skip`         |
| Skip Checkstyle standards check | `mvn clean verify -Dcheckstyle.skip`     |
| Skip Spotless formatting check  | `mvn clean verify -Dspotless.check.skip` |
| Format code                     | `mvn spotless:apply`                     |

