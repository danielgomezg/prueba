FROM openjdk:8
 LABEL mantenedor = “danygb1000@gmail.com”
 VOLUME / tmp
 EXPOSE 5000
 ADD target / test-0.0.1-SNAPSHOT.jar test -0.0.1-SNAPSHOT.jar
 ENTRYPOINT ["java", "- jar", "test-0.0.1-SNAPSHOT.jar"]