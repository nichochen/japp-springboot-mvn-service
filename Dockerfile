FROM openjdk:10-jre-slim
ENV PORT 8080
EXPOSE 8080
COPY ./target/*.jar /opt/target/
WORKDIR /opt/target

CMD ["/bin/bash", "-c", "java -jar /opt/target/japp-0.0.1-SNAPSHOT.jar"]
