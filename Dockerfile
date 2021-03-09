FROM openjdk:8-alpine

COPY target/uberjar/avantqui.jar /avantqui/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/avantqui/app.jar"]
