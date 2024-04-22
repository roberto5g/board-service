FROM openjdk:17-alpine

ARG PROFILE

ENV PROFILE $PROFILE
ENV APP_NAME board-service.jar
ENV PORT 8080

ADD board-application/target/*.jar ${APP_NAME}

EXPOSE ${PORT}

ENTRYPOINT java ${JAVA_OPTS} -jar ${APP_NAME}
