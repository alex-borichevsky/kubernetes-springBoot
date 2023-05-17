FROM openjdk:17-jdk
ENV JAVA_HOME="C:\Program Files\Java\jdk-18.0.2.1"
ENV PATH="$JAVA_HOME\bin:$PATH"
EXPOSE 8080
WORKDIR /app
COPY target/employee-producer-0.0.1-SNAPSHOT.jar /app

CMD ["java", "-jar", "employee-producer-0.0.1-SNAPSHOT.jar"]