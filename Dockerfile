FROM openjdk:11
EXPOSE 4567
COPY target/bootjar.jar bootjar.jar
ENTRYPOINT ["java","-jar","/bootjar.jar"] 