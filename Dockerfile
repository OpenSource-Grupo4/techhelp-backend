FROM amazoncorretto:22

# the JAR file path
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

CMD apt-get update -y

# Set the default command to run the Java application
ENTRYPOINT ["java", "-Xmx2048M", "-jar", "/application.jar"]