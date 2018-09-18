FROM dhpcontainreg.azurecr.io/dhpcore-image/openjdk:8-jdk-alpine3.8
VOLUME /tmp
COPY build/libs/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
