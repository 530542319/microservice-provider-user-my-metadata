FROM dockette/openjdk8

WORKDIR /app

COPY target/*.jar /app/app.jar

EXPOSE 8000

CMD ["java","-jar","app.jar"]
