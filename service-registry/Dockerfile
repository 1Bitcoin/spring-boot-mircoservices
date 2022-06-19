FROM openjdk:17
ARG JAR_FILE=target/*.jar
ADD ${JAR_FILE} target/service-registry.jar
ENTRYPOINT ["java","-jar","target/service-registry.jar"]
EXPOSE 8761