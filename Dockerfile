# Alpine Linux with OpenJDK JRE
FROM openjdk:11
# copy WAR into image
COPY /home/vsts/work/1/a/target/SecureBankingSystem.war /SecureBankingSystem.war 
