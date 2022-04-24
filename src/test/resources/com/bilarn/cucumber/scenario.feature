Feature: Simple Addition using cucumber

  Scenario Outline: Addition of numbers
    Given x=<int1>
    And y=<int11>
    When I add up x and y
    Then I should get result as <int12>
    Examples:
      | int1 | int11 | int12 |
      | 3    | 2     | 5     |