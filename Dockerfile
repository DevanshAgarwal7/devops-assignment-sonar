FROM openjdk:11
ADD target/SimpleApp-0.0.1-SNAPSHOT.jar SimpleApp-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD [ "java", "-jar", "SimpleApp-0.0.1-SNAPSHOT.jar" ]