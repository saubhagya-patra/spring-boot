FROM openjdk:17-jdk-slim
WORKDIR /app
COPY ./target/app.jar /app
EXPOSE 8080
#Command to run the application
CMD ["java","-jar","app.jar"]