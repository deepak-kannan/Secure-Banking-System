# Pull base image
From tomcat:8-jre8
RUN ls
WORKDIR /home/vsts/work/1/s/target/
RUN ls
# Copy to images tomcat path
ADD SecureBankingSystem.war /usr/local/tomcat/webapps/
