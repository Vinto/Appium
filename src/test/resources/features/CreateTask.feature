Feature: Create New Task
  Scenario: The user user can add new Task
    Given Click Add New Task
    Given Enter TaskName
    Given Enter TaskDescription
    When Click Save
    Then Task is added successfully