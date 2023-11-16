FROM openjdk:17
COPY /target/histogram.opentelemetry-0.0.1-SNAPSHOT.jar histogram.openetelemetry.jar
ADD opentelemetry-javaagent.jar /opentelemetry-javaagent.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","-javaagent:/opentelemetry-javaagent.jar","histogram.openetelemetry.jar"]