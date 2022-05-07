FROM openjdk:11
COPY ./target/backend-springboot.jar ./
WORKDIR ./
EXPOSE 5050
CMD ["java", "-jar", "backend-springboot.jar"]