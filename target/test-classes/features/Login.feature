@scenarioOutline
Feature: Login feature
  As a user, I should be able login with correct credentials to different accounts and dashboard should be displayed as Portal.




    Scenario Outline: Bitrix24 title verification after log in.

      When User types username "<username>"
      When User types password password
      Then User should see Portal in the title

    Examples:
      | username                       |
      | marketing51@cybertekschool.com |
      | marketing52@cybertekschool.com |
      | hr51@cybertekschool.com        |
      | hr52@cybertekschool.com        |
      | helpdesk51@cybertekschool.com  |
      | helpdesk52@cybertekschool.com  |




