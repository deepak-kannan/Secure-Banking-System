# OpenJDK JRE
FROM openjdk:11 as build

# copy WAR into image
COPY /home/vsts/work/1/s/target/SecureBankingSystem.war /SecureBankingSystem.war 
