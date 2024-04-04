FROM adoptopenjdk:8-jre
WORKDIR /app
COPY ./build/libs/telecom-backend-system.jar /app/
CMD ["java", "-jar", "telecom-backend-system.jar"]