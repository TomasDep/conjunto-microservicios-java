FROM amazoncorretto:17.0.5

WORKDIR /app

COPY ./target/msvc-cursos-0.0.1-SNAPSHOT.jar .

EXPOSE 8001

ENTRYPOINT ["java", "-jar", "msvc-cursos-0.0.1-SNAPSHOT.jar"]