Technologies Used: IntelliJ IDEA Ultimate (Spring Initializer), 
Backend: Spring Boot, JPA (Hibernate)
Database:  MySQL Server 8.3, MySQL Shell 8.3, MySQL Workbench 8.0 CE
Development Environments: IntelliJ IDEA Ultimate, Visual Studio Code (optional)
API Client: Postman (other tools also compatible)

IntelliJ IDEA:
Use the Spring Initializr to create a new Spring Boot project.
Select Spring Data JPA, Spring Boot DevTools, and Spring Web dependencies.
Import the cloned project into your IDE.

Install the Spring Boot Extensions Pack extension.
Import the cloned project into your workspace.
 Configure database connection:

Update the application.properties file with your actual MySQL credentials.
Ensure you have the appropriate mysql-connector-java driver included in your project.
Run the application:

IntelliJ IDEA: Right-click on the main class and select "Run".
Visual Studio Code: Use the "Spring Boot: Run" task or terminal commands.
Access the API:

The default application URL is typically http://localhost:8080.
Use Postman or other API clients to interact with the API endpoints documented below.
Features:
GET /Product: Retrieve a list of all Product.
GET /Product/{productname, price, quantity}: Get details of a specific Products stored in db.

