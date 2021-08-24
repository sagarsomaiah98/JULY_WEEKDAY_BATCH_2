Feature: Order 
Scenario: Order Functionality
Given launch the browser
And there user logs in through Login Window by using Username as "standard_user" and Password as "secret_sauce"
And I click addtocart
And I click on cart
And I enter the details
And I place the order
Then order is placed successfully