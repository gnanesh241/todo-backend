FROM maven:3.8.4-openjdk-17 AS build

WORKDIR /app

COPY pom.xml .
RUN mvn dependency:go-offline

COPY src ./src
RUN mvn package -DskipTests

FROM openjdk:17-jdk-slim

EXPOSE 8080

COPY --from=build /app/target/DemoSpringBoot-*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
