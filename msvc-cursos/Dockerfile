ARG MSVC_NAME=msvc-cursos

FROM --platform=linux/amd64 amazoncorretto:17.0.5-alpine as builder

ARG MSVC_NAME

WORKDIR /app/$MSVC_NAME

COPY ./pom.xml /app
COPY ./$MSVC_NAME/.mvn ./.mvn
COPY ./$MSVC_NAME/mvnw .
COPY ./$MSVC_NAME/pom.xml .

#   Descarga de dependencias
RUN ./mvnw clean package -Dmaven.test.skip -Dmaven.main.skip -Dspring-boot.repackage.skip && rm -r ./target/

COPY ./$MSVC_NAME/src ./src

RUN ./mvnw clean package -DskipTests

FROM --platform=linux/amd64 amazoncorretto:17.0.5-alpine

WORKDIR /app
RUN mkdir ./logs

ARG MSVC_NAME
ARG TARGET_FOLDER=/app/$MSVC_NAME/target

COPY --from=builder $TARGET_FOLDER/msvc-cursos-0.0.1-SNAPSHOT.jar .

ARG PORT_APP=8002

ENV PORT $PORT_APP

EXPOSE $PORT

CMD sleep 20 && java -jar msvc-cursos-0.0.1-SNAPSHOT.jar
#ENTRYPOINT ["java", "-jar", "msvc-cursos-0.0.1-SNAPSHOT.jar"]