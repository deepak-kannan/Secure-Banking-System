FROM tomcat:8.0-alpine
RUN ["rm", "-rf", "/usr/local/tomcat/webapps"]
ADD target/SecureBankingSystem.war /usr/local/tomcat/webapps/SecureBankingSystem.war
