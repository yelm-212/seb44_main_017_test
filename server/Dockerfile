FROM openjdk:11-jdk
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENV JAVA_OPTS="-Dcom.amazonaws.sdk.disableEc2Metadata=true"
EXPOSE 8080
#HEALTHCHECK --interval=5s --timeout=5s --start-period=15s --retries=10 CMD wget http://localhost:8080/actuator/health --quiet --output-document - > ~/logs/docker-logfile.log 2>&1
ENTRYPOINT ["java","-jar","/app.jar"]
