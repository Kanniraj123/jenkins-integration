FROM openjdk:17
EXPOSE 8080
ADD target/spring-jenkins-docker.jar spring-jenkins-docker.jar
ENTRYPOINT ["java","-jar","spring-jenkins-docker.jar"]