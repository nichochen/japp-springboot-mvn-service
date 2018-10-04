FROM maven:3-jdk-10 as BUILD

COPY . /usr/src/app
RUN mvn --batch-mode -f /usr/src/app/pom.xml clean package

FROM openjdk:10-jre-slim
ENV PORT 8080
EXPOSE 8080
COPY --from=BUILD /usr/src/app/target /opt/target
WORKDIR /opt/target

CMD ["/bin/bash", "-c", "java -jar /opt/target/japp-0.0.1-SNAPSHOT.jar"]
