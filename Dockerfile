FROM --platform=linux/amd64 public.ecr.aws/amazoncorretto/amazoncorretto:11
WORKDIR /app
COPY ./target/app.jar /app
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
