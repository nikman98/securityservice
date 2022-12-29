FROM openjdk:8
EXPOSE 8001
ADD target/security-service.jar security-service.jar
ENTRYPOINT ["java","-jar", "/security-service.jar"]