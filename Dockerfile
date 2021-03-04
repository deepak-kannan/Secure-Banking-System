# Alpine Linux with OpenJDK JRE
FROM openjdk:11-jre-alpine
# copy WAR into image
COPY SecureBankingSystem.war /SecureBankingSystem.war 
