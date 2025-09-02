# Selenium TestNG Project with jenkins

This is a demo project for Selenium Page Object Model with Extent reporting.

### Pre-requisites
* Java
* Maven
* IntelliJ IDEA
* Extent reoport libraries

### Steps
1. Clone this project
2. Open the project in Intellij IDEA
3. Add Chaintest library, properties file, annotations in tests.
4. Run through maven with command -> clean test -DXmlFile=TestNG.xml
5. Find results in report/Index.html

### Jenkins Steps -
Install jenkins.war from jenkins website - https://www.jenkins.io/download/
Start jenkins server - java -jar C:\Users\rajde\Downloads\jenkins.war.
Navigate to Jenkins dashboard - http://localhost:8080, Setup credentials.
Add Maven and Java home path in Mangae Jenkins.
Create item + add git url = add build actions steps.
Build job.
Check console.

### Report -

<img width="1898" height="887" alt="image" src="https://github.com/user-attachments/assets/03d6474b-16ac-46eb-8541-dd824cf35185" />
