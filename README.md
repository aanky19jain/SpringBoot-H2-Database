# NewRelic

## Requirements

- Java 8
- [Apache Maven](https://maven.apache.org/)
- Editor of your choice (IntelliJ, STS or Eclipse), configure the editor with [lombok](https://projectlombok.org/setup/intellij) support.

## Build instructions

- `./mvnw clean install` or `./mvnw package`

## Running the application locally

- `./mvnw spring-boot:run`

## NewRelic command

- `java -javaagent:/newrelic/newrelic.jar -jar target/SpringBoot-H2-0.0.1.jar`

## Notes:

- Sign up for Free NewRelic Account [here](https://newrelic.com/)
- Get your License key from NewRelic account to hook up your SpringBoot application to the new relic, newrelic.yml will be generated with your license key, download that file.
- Download newrelic zip and unzip the contents and copy the newrelic.yml from previous step at the root level of newrelic folder
- Copy the newrelic folder to the root level of the Spring Boot project
- Run the below command to see Application Performance on NewRelic:
  `java -javaagent:/newrelic/newrelic.jar -jar target/SpringBoot-H2-0.0.1.jar`
