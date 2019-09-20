FROM openjdk:8u181-jdk-alpine3.8

WORKDIR /app

COPY target/*.jar /app/app.jar

EXPOSE 8000

CMD ["java","-jar","app.jar"]
