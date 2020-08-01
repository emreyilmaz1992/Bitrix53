@us9
Feature: "9. As a user, I should be able to use ""Filter
  and search"" functionality on Active Stream."



  "1. User should be able to search by clicking on default filters. (work, favorate, my activity, annoucements, and workflows)
  2. User should be able to search by selecting Date, Type, Author, To and more default dropdowns.
  3. User should be able to type-in keyword to search previous posts.
  4. User should be able to use Save Filter functionality on search bar. "


  @login @logOut
  Scenario Outline: AC-3

  AC-1)  User should be able to search by clicking on default filters. (work, favorate, my activity, annoucements, and workflows)


    And enter valid "<username>" and password
    When user click search tab
    Then user search "<search item>"



    Examples:
      | username                      | search item |
      | helpdesk51@cybertekschool.com | test        |



  @login @logOut
  Scenario Outline: AC-3(Selecting Date)

  AC-2)  User should be able to search by selecting Date, Type, Author, To and more default dropdowns.


    And enter valid "<username>" and password
    When user click search tab
    Then select option under Date Dropdown



    Examples:
      | username                      |
      | helpdesk51@cybertekschool.com |


  @login @logOut
  Scenario Outline: AC-3(Selecting Type)

  AC-2)  User should be able to search by selecting Date, Type, Author, To and more default dropdowns.


    And enter valid "<username>" and password
    When user click search tab
    Then select option under Type Dropdown




    Examples:
      | username                      |
      | helpdesk51@cybertekschool.com |

  @login  @logOut
  Scenario Outline: AC-3(Selecting Author)

  AC-2)  User should be able to search by selecting Date, Type, Author, To and more default dropdowns.


    And enter valid "<username>" and password
    When user click search tab
    Then select author under Author Dropdown




    Examples:
      | username                      |
      | helpdesk51@cybertekschool.com |



  @login   @logOut
  Scenario Outline: AC-3(Selecting To)

  AC-2)  User should be able to search by selecting Date, Type, Author, To and more default dropdowns.


    And enter valid "<username>" and password
    When user click search tab
    Then select TO under TO Dropdown




    Examples:
      | username                      |
      | helpdesk51@cybertekschool.com |


  @login  @tatata @logOut
  Scenario Outline: AC-4(Using Save Filter)

  AC-4)  User should be able to use Save Filter functionality on search bar. "


    And enter valid "<username>" and password
    When user click search tab
    Then click save filter




    Examples:
      | username                      |
      | helpdesk51@cybertekschool.com |