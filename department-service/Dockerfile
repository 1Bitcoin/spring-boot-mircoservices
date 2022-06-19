FROM openjdk:17
ARG JAR_FILE=target/*.jar
ADD ${JAR_FILE} target/department-service.jar
ENTRYPOINT ["java","-jar","target/department-service.jar"]
EXPOSE 9001


