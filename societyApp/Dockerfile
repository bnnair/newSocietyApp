FROM openjdk:8-jdk-alpine
Maintainer Biju Nair

ARG JAR_FILE=./*.jar

COPY ${JAR_FILE} societyapp.jar

ENTRYPOINT ["java","-jar","/societyapp.jar"]
