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