# Alpine Linux with OpenJDK JRE
FROM openjdk:11
# copy WAR into image
COPY $(system.defaultworkingdirectory)/SecureBankingSystem.war /SecureBankingSystem.war 
