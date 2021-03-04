# OpenJDK JRE
FROM openjdk:11 

# copy WAR into image
ADD /home/vsts/work/1/s/target/SecureBankingSystem.war SecureBankingSystem.war 
