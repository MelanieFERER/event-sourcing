FROM adoptopenjdk/openjdk11:alpine-jre

ARG JAR_FILE=target/event-sourcing.jar

WORKDIR /opt/app

COPY ${JAR_FILE} event-sourcing.jar

COPY entrypoint.sh entrypoint.sh

RUN chmod 755 entrypoint.sh

ENTRYPOINT ["./entrypoint.sh"]