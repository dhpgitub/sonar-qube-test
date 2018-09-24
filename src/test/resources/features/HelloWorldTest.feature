@tag
Feature: Return Hello World Test

  @tag1
  Scenario Outline: Run process with accurate results
    Given the process is setup
    When the process is run
    Then I validate the "<result>"

    Examples:
      |result|
      |Hello World|
  
   @tag1
    Scenario Outline: This is dev 1 scenario
    Given dev1 is at office
    When dev1 is not sleeping
    Then dev1 should complete coding

    Examples:
      |result|
      |Hello World|
  
   @tag1
    Scenario Outline: This is dev 2 scenario
    Given dev2 is at office
    When dev2 is not sleeping
    Then dev2 should complete coding

    Examples:
      |result|
      |Hello World|