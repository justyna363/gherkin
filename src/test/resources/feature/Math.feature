Feature: Math calculation

  This feature include functionality which cover mathematic substraction with more than two numbers.

  Background:
    Given I have number 10

  Scenario: Can subtract three numbers
    When I subtract numbers 7,3
    Then I get 0

  Scenario: Can subtract two numbers
    When I subtract numbers 7
    Then I get 3

  Scenario: Can subtract three numbers
    When I subtract set
      | 7 | 3 |
    Then I get 0

  Scenario: Can subtract three numbers
    When I subtract numbers:
      | 7 |
      | 3 |
    Then I get 0

  Scenario Outline: Can subtract three numbers
    When I subtract numbers <number1>
    And I subtract numbers <number2>
    Then I get <result>

    Examples:
      |number1|number2|result|
      |3      |7      |0     |
      |5      |5      |0     |
      |7      |2      |1     |

