FROM openjdk:17-jdk-slim-buster
ARG JAR_FILE=build/libs/*.jar
RUN echo $JAR_FILE
COPY ${JAR_FILE} app.jar

ADD https://github.com/ufoscout/docker-compose-wait/releases/download/2.9.0/wait /wait
RUN chmod +x /wait

EXPOSE 8081
ENTRYPOINT ["java","-jar","/app.jar"]