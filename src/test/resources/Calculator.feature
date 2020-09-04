Feature: Create Calculator that perform Addition, Subtraction, Division and Multiplication

  Scenario: Perform Addition of two numbers
    Given You have a calculator
    When Operator is "ADD", first number is 3 and second number is 4
    Then The result is 7

  Scenario: Perform Subtraction of two numbers
    Given You have a calculator
    When Operator is "SUB", first number is 6 and second number is 4
    Then The result is 2