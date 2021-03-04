# Alpine Linux with OpenJDK JRE
FROM openjdk:11
# copy WAR into image
COPY ../SecureBankingSystem.war /SecureBankingSystem.war 
