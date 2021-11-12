# SwagLabsProject

### Project Description
The goal of this project was to create a web testing framework for the https://www.saucedemo.com/ shopping website. The framework mainly focuses on testing the website's navigation and functionality.

Functionality of the framework covers:
- Site navigation
- Login/logout process
- Product page item sort
- Basket functionality
- Checkout process
- Social media Links


### User Instructions
A Chrome Driver is required to run the framework.

When you clone the repository and first open the project up in IntelliJ,
you will need to put the chromedriver.exe into the following directory:
src/test/resources/drivers/chromedriver.exe.

### Framework Code Approach
In order to make the framework followed a Page Object Model. This allows for:
- A clean separation between test code and page specific code such as locators and layout.
- A single repository for the services or operations offered by the page rather than having these services scattered throughout the tests.

Furthermore, we made a driver factory with the intention for it to be possible for more drivers to be easily added in the future.

Additionally, OOP and SOLID also guided our approach.

### Tools Used
- Selenium 3.141
- Cucumber 6.11
- Junit 5.8
