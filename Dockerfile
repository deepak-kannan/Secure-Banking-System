# Alpine Linux with OpenJDK JRE
FROM openjdk:11
RUN dir
# copy WAR into image
COPY /home/vsts/work/1/s/target/SecureBankingSystem.war /SecureBankingSystem.war 
