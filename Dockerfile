FROM openjdk:20
MAINTAINER EliasUpstein
COPY target/EliasUpstein-0.0.1-SNAPSHOT.jar portback-app.jar
ENTRYPOINT ["java", "-jar", "/portback-app.jar"]