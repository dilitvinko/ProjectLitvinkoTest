FROM java:8
WORKDIR /
ADD ./target/testFinProj.jar testFinProj.jar
EXPOSE 8080
CMD ["java", "-jar", "testFinProj.jar"]
