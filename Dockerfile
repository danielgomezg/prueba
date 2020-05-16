FROM java: 8
 LABEL mantenedor = “danygb1000@gmail.com”
 VOLUMEN / tmp
 EXPOSE 5000
 AGREGAR target / spring-boot-data-jpa-example-0.0.1-SNAPSHOT.jar spring-boot-data-jpa-example -0.0.1-SNAPSHOT.jar
 ENTRYPOINT ["java", "- jar", "spring-boot-data-jpa-example-0.0.1-SNAPSHOT.jar"]