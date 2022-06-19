FROM openjdk:17
ARG JAR_FILE=target/*.jar
ADD ${JAR_FILE} target/api-gateway.jar
ENTRYPOINT ["java","-jar","target/api-gateway.jar"]
EXPOSE 9191