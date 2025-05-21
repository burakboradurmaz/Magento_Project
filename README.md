# Magento Website Project

Project Purpose

The mission is to automatically test the following core functions for the Magento Project:

1. Creating a new user registration
2. Login and authorization
3. Adding and editing addresses
4. Product search and filtering
5. Adding & removing products to & from the cart
6. Creating and completing orders
7. Managing favorite lists
8. Menu verification

Project Structure

MagentoProject_Cucumber/
├── src/
│   └── test/
│       │
│       ├── java/
│       │   ├── featureFiles/                # .feature files written in Gherkin
│       │   ├── hooks/                       # Cucumber Hooks (Before/After)
│       │   ├── pages/                       # Page Object Model classes
│       │   ├── runners/                     # TestNG runner classes
│       │   │   └── XML/                     # TestNG XML configuration files
│       │   ├── stepDefinitions/             # Cucumber step definitions
│       │   └── utilities/                   # Driver, ConfigReader, ExtentReportManager, etc.
│       │
│       └── resources/                       # ExtentReports configuration
│
├── testGifs/                                # GIFs used in reports
├── testReports/                             # Spark & PDF report output (auto-generated)
├── configuration.properties                 # General test configuration
├── pom.xml                                  # Maven build configuration
└── README.md                                # Project README

Team Members

|           MEMBER        |ROLE|
|sewoesterserkan@gmail.com | QA |
|ennur789@gmail.com        | QA |
|burakboradurmaz@gmail.com | QA |
|murattoksuz@gmail.com     | QA |
|gokdemir.aysenur@gmail.com| QA |
|hakan_merts@hotmail.com   | QA |
|canibr97@gmail.com        | QA |
|yilmaztuba.ty@gmail.com   | QA |


Installation
1. Copy the repository
   git clone https://github.com/burakboradurmaz/Magento_Project.git
2. Open the project on IntelliJ IDEA
3. Run the project
   mvn clean install