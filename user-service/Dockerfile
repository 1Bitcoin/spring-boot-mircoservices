FROM openjdk:17
ARG JAR_FILE=target/*.jar
ADD ${JAR_FILE} target/user-service.jar
ENTRYPOINT ["java","-jar","target/user-service.jar"]
EXPOSE 9002