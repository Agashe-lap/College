FROM maven:3.8.1-openjdk-17 as Build
COPY . .
RUN mvn package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY  --from=build /target/CollegeCRUDDocker-0.0.1-SNAPSHOT.jar CollegeCRUDDocker.jar
EXPOSE 8080
ENTRYPOINT [ "java","-jar","CollegeCRUDDocker.jar"]