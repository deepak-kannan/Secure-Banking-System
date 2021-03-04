# Pull base image
From tomcat:8-jre8
RUN ls
# Copy to images tomcat path
ADD ./s/target/SecureBankingSystem.war /usr/local/tomcat/webapps/
