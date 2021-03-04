FROM tomcat:8.0-alpine
RUN ["rm", "-rf", "/usr/local/tomcat/webapps"]
WORKDIR /home/vsts/work/1/a
RUN dir
ADD target/SecureBankingSystem.war /usr/local/tomcat/webapps/SecureBankingSystem.war
