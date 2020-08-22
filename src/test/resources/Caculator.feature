Feature: Create Calculator that perform Addition, Subtraction, Division and Multiplication
  Scenario: Perform Addition of two numbers
    Given You have a calculator
    When Operator is '+', first number is 3 and second number is 4
    Then The result is 7

  Scenario: Perform Subtraction of two numbers
    Given You have a calculator
    When Operator is '-', first number is 6 and second number is 4
    Then The result is 2

  Scenario: Perform Multiplication of two numbers
    Given You have a calculator
    When Operator is '*', first number is 7 and second number is 4
    Then The result is 28