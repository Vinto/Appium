Feature: Create New Task
  Scenario Outline: The user can add new task
    Given Click Add New Task
    Given Enter "<TaskName>" and "<TaskDescription>"
    Then Task is added successfully

    Examples:
      | TaskName | TaskDescription |
      | Cucumber Task 1 | Task 1 details |
      | Cucumber Task 2 | Task 2 details |