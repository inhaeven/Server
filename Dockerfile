FROM openjdk:21-slim
WORKDIR /app
COPY build/libs/*.jar ./inhaeven.jar
EXPOSE 8080
CMD ["java", "-jar", "/app/inhaeven.jar"]