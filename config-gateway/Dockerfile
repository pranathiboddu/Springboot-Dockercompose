FROM openjdk:11-jre
WORKDIR /usr/src
ADD ./target/config-gateway-0.0.1-SNAPSHOT.jar /usr/src/config-gateway-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/src/config-gateway-0.0.1-SNAPSHOT.jar"]



