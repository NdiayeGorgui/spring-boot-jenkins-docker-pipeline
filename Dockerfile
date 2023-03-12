FROM openjdk:11
EXPOSE 8087
ADD target/spring-boot-jenkins-docker-pipeline.jar spring-boot-jenkins-docker-pipeline.jar
ENTRYPOINT  ["java", "-jar", "/spring-boot-jenkins-docker-pipeline.jar"]
