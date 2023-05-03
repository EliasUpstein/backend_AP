FROM amazoncorretto:11-alpine-jdk
MAINTAINER EliasUpstein
COPY target/EliasUpstein-0.0.1-SNAPSHOT.jar portback-app.jar
ENTRYPOINT ["java", "-jar", "/portback-app.jar"]