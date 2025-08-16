# Selenium WebDriver + TestNG
This project is a **Selenium WebDriver** automation Framework built with **java** and **TestNG** for Testing Web Applications.It provides a basic Setup 
for Browser automation,TestExecution and Reporting .
## Depandancies :
Selenium-java : Version 4.20.0
Webdrivermanager : Version 5.8.0
testng : Version 7.8.0
extentreports : Version 5.0.9
## Projects Stracture  
<img width="380" height="522" alt="image" src="https://github.com/user-attachments/assets/c2f33aac-3454-42a6-bff5-54d43c11c6af" />

We have 2 pachages :
**pages**: Contains page classes representing the web pages and encapsulating web element locators and actions.  
**tests**: Contains TestNG test classes that interact with page objects to perform tests.  
**pom.xml**: Maven configuration with project dependencies. 
## Test flow
We use End-To-End Testing E-commerce senario :
1. **Login**: User logs in valid credentials.
2. **Search product**: user searches for a product.
3. **Add product to Cart** : user selects a product and adds it to the cart.
4. **Log out**: user logs out of the application .
   This flow is implemented using the **Page Object Model**,separating page interactions(Cosmetique pages) from Test logic(Cosmetique Test).
   Finally we finished by HTML reporting:
   <img width="1917" height="1051" alt="image" src="https://github.com/user-attachments/assets/9f1c3e89-b306-4b03-990d-90e2e54b2066" />
 
   
