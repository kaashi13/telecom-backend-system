FROM adoptopenjdk:8-jdk AS builder
WORKDIR /app
COPY . .
RUN ./gradlew clean && ./gradlew bootJar

FROM adoptopenjdk:8-jre
WORKDIR /app
COPY --from=builder /app/build/libs/telecom-backend-system.jar .
CMD ["java", "-jar", "telecom-backend-system.jar"]