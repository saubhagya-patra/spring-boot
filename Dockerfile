FROM eclipse-temurin:11-jdk-jammy
WORKDIR /app
COPY ./target/app.jar /app
EXPOSE 8080
#Command to run the application
CMD ["java","-jar","app.jar"]