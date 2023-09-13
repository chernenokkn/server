FROM openjdk:11
ADD build/libs/server-0.0.1.jar app.jar
EXPOSE 8090
ENV JAVA_OPTS=""
ENTRYPOINT exec java $JAVA_OPTS -Dspring.profiles.active=dev -jar /app.jar