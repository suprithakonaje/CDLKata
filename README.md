# Supermarket Checkout System
This is a Java program that simulates a checkout system for a supermarket, where customers can scan items and receive a receipt with a running total of their purchase.

## Dependencies
To run the checkout system and it's test cases, you will need the following dependencies:

1. JUnit 5

2. JDK 8 or higher

## Getting Started
To run this program, you'll need to have Java installed on your computer. Clone the repository and open the project in your preferred Java IDE.

## Usage
The CheckoutSystem class is the main class of the program, which handles the checkout process. It takes two arguments, a map of item prices and a map of special prices based on quantity for that particular item. These maps can be passed as arguments when creating an instance of the CheckoutSystem class.

To start the checkout process, run the main method in the CheckoutSystem class. The program will prompt you to scan items using their corresponding characters. You can scan as many items as you want, and when you're finished, enter 'q' to quit. The program will then display the final total of your purchase.

## Classes
### CheckoutSystem
This is the main class of the program that handles the checkout process. It takes two arguments, a map of item prices and a map of special prices based on quantity for that particular item. It contains the main method which runs the program, prompting the user to scan items and displaying the final total of the purchase.

###Item
This is a data structure for an item in the supermarket. It contains the item's name, price, and quantity.

###SpecialPrices
This is a data structure for special prices based on quantity for a particular item in the supermarket. It contains the quantity and price for the special offer.

###Receipt
This is a utility class for generating an on-screen receipt for each item that is scanned, and returning the running total and final total of the purchase.

###PricingRules
This class contains pre-defined pricing rules for items in the supermarket, which can be updated for checkout transactions. It returns a map of item name and special price based on quantity for that particular item.

## Test Class

### CheckoutSystemTest
This class contains unit tests for the CheckoutSystem class, which implements a checkout system for a supermarket.

## Usage
To run the tests, navigate to the CheckoutSystemTest class and run it as a JUnit test.

The test output will indicate whether each test case has passed or failed.

## Test Cases
The CheckoutSystemTest class contains the following test cases:

1. testOneScanForRunningTotalAndFinalTotal: Tests the running total and final total when a single item is scanned.
2. testMultipleScanForRunningTotalAndFinalTotal: Tests the running total and final total when multiple items are scanned.
3. testRepeatedMultipleScanForRunningTotalAndFinalTotal: Tests the running total and final total when multiple items are scanned repeatedly.
4. testRepeatedInAnyOrderMultipleScanForRunningTotalAndFinalTotal: Tests the running total and final total when multiple items are scanned repeatedly in any order.