FROM eclipse-temurin:17-jdk


COPY target/*.jar spring-jenkins-deployment.jar

EXPOSE 9191

ENTRYPOINT ["java","-jar","spring-jenkins-deployment.jar"]
