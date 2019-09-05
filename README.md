# Facebook Automation Test
This is the sample project to demostrate the usage of selenium tool to automate facebook app using Page Object Model(POM)
Design Pattern.

# <h3>Software Requirement:
* Java 8 - JDK
* Eclipse/ IntelliJ
* TestNG plugin for Eclipse
* Maven
* Chrome/Firefox browser.

# <h3>Project Structure:
Once you import the project to the IDE, you will be able to see various packages in the
project repo.

All the Page classes related to the app is available in the below package
>com.testingfoo.pages

All the test classes related to the app is available in the below package
>com.testingfoo.tests

The runner classes related to the framework is available in the resource folder.

# <h3>How to run this test?
1. **Using IDE**:
     * Clone this repository to the local machine.
     * Open the IDE of your choice. ( Say : Eclipse)
     * Click on File -> Import -> Maven -> Import Existing maven project.
     * Once the import is successful, Right click on POM.xml file. Select Run as -> Maven Build.
     * Once the Maven build is successful, Right click on POM.xml file. Select Run as -> Maven Clean.
     * Navigate to Resources-> Runner-> Right click on runnertestng.xml file. Select Run as -> TestNG Suite.
  
  2. **Using Terminal**:
     * Clone this repository to the local machine.
     * Open the terminal and navigate to the folder with POM.xml file.
     * Run the below command to run a specific test file       
       >mvn clean test
       
