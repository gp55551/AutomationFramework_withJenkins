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
1. Install jenkins.war from jenkins website - https://www.jenkins.io/download/
2. Start jenkins server - java -jar C:\Users\rajde\Downloads\jenkins.war.
3. Navigate to Jenkins dashboard - http://localhost:8080, Setup credentials.
4. Add Maven and Java home path in Mangae Jenkins.
5. Create item + add git url = add build actions steps.
6. Build job.
7. Check console.

### Report -

<img width="1913" height="958" alt="image" src="https://github.com/user-attachments/assets/871de705-db46-4e5c-8bbd-ae2188ae7501" />

<img width="1892" height="953" alt="image" src="https://github.com/user-attachments/assets/d5518aa8-72ab-4f57-ad6a-9dce9a69f4ca" />

<img width="1883" height="947" alt="image" src="https://github.com/user-attachments/assets/da6db762-1c7a-47b9-8604-12c8e8063c01" />


