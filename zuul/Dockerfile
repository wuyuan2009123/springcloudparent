FROM hub.c.163.com/ringou/openjdk7

VOLUME /tmp

ADD target/*.jar app.jar

EXPOSE 8088

ENTRYPOINT ["java", "-jar" , "/app.jar"]