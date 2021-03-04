FROM tomcat:8.0-alpine
ADD /home/vsts/work/1/s/target/SecureBankingSystem.war /usr/local/tomcat/webapps/SecureBankingSystem.war
