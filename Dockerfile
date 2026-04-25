FROM --platform=linux/amd64 amazoncorretto:11    # ✅ Docker Hub, no auth needed
WORKDIR /app
COPY ./target/app.jar /app
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]