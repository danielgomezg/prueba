#FROM java:8
From openjdk:8-jdk-alpine
 LABEL maintainer=“chathuranga.t@gmail.com”
 VOLUME / tmp
 EXPOSE 8081
 #ADD target/test-0.0.1-SNAPSHOT.jar test-0.0.1-SNAPSHOT.jar
 ARG JAR_FILE=target/test-0.0.1-SNAPSHOT.jar
 ADD ${JAR_FILE} test-0.0.1-SNAPSHOT.jar
 ENTRYPOINT ["java", "- jar", "test-0.0.1-SNAPSHOT.jar"]
#joojojo

 #EXPOSE 5000
