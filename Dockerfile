FROM openjdk:18

LABEL maintainer=tim@webappsolution.com

WORKDIR /app
COPY build/libs/demo-0.0.1-SNAPSHOT.jar customersapi.jar

EXPOSE 8080
EXPOSE 8082

CMD ["java", "-jar", "customersapi.jar"]