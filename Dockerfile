FROM openjdk:17.0.2-slim

EXPOSE 8080
ADD /target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]