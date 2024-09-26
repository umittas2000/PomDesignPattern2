## Problems without Framework:
1. Code duplications
2. updating the locator when they change


## What is Page Object Model?

•POM is a design pattern used in automated testing to make your code more maintainable, reusable, and organized. in this pattern, each web page of the application is represented as a separate class in the test automation framework. each class corresponds to a single page or component, and within that class, you define all the methods to interact with the page elements like buttons, forms, or links.

## Why we need POM?

•Instead of hardcoding how you interact with each element in every test, you centralize the logic in these page objects. this makes tests cleaner and less prone to breaking when the web application’s user interface changes. by isolating page elements and their actions, you only need to update the page classes if something changes.


## Pom structure Test Layer

•Pom separates project in to test layer and framework layer.
•Locating elements and page interactions will be done in framework layer.
•Test layer doesn’t need to know details about application under test (aut)
•Framework layer, Each page object class typically includes:
	- Constructor
	- Locators
	- Action Methods
	- Handles
