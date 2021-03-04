# Pull base image
From tomcat:8-jre8

# Copy to images tomcat path
ADD /home/vsts/work/1/s/target/SecureBankingSystem.war /usr/local/tomcat/webapps/
