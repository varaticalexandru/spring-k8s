FROM alpine:latest

RUN apk add openjdk21
COPY ./build/libs/app.jar ./app.jar
EXPOSE 8001

ENTRYPOINT ["java", "-jar", "app.jar"]