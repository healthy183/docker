# Dockerfile
FROM java:8-jre

MAINTAINER Healthy183

ENTRYPOINT ["/usr/bin/java", "-jar", "/usr/share/first-docker.jar"]

# Add Maven dependencies
#ADD target/lib           /usr/share/

# Add the service itself
ARG JAR_FILE
ADD ${JAR_FILE} /usr/share/first-docker.jar

