FROM tomcat:8.0-alpine
RUN ["rm", "-rf", "/usr/local/tomcat/webapps"]
ADD /home/vsts/work/1/a/target/SecureBankingSystem.war /usr/local/tomcat/webapps/SecureBankingSystem.war
