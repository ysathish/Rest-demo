FROM openjdk:22-jdk
ADD target/Rest-Demo.jar Rest-Demo.jar
ENTRYPOINT [ "java","-jar","/Rest-Demo.jar" ]