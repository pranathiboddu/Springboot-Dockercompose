FROM openjdk:11-jre
WORKDIR /usr/src
ADD ./target/ConfigServer-0.0.1-SNAPSHOT.jar /usr/src/ConfigServer-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/src/ConfigServer-0.0.1-SNAPSHOT.jar"]



