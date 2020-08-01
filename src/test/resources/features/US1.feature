@us1
Feature: US1

  1. As a user, I should be able to send messages by clicking on Message tab under Active Stream.


  AC1) User should be able to click on upload files icon to upload files and pictures from local disks, download from external drive,
  select documents from bixtrix24, and create files to upload.
  AC2) User should be able to add users from selecting contact from E-mail user, Employees and Departments and Recent contact lists.
  AC3) User should be able to attach link by clicking on the link icon.
  AC4) User should be able to insert videos by clicking on the video icon and entering the video URL.
  AC5) User should be able to create a quote by clicking on the Comma icon.
  AC6) User should be able to add mention by clicking on the Add mention icon and select contacts from the lists provided in dropdown.
  AC7) User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
  AC8) User should be able to click on the Topic icon to see the Message Topic text box displays on top of the message box.
  AC9) User should be able to click on ""Record Video"" tab to record a video and attach it with the message."


  Scenario Template: AC1) upload files and pictures from local disc

  AC1) User should be able to click on upload files icon to upload files and pictures from local disks, download from external drive,
  select documents from bixtrix24, and create files to upload.

    Given enter valid "<username>" and password
    When click "message" under activity stream
    Then click "upload files" under message
    And user click upload file and images



    Scenarios: :
  | username                      |
  | helpdesk51@cybertekschool.com |


    @65
  Scenario Template: AC1) download from external drive

  AC1) User should be able to click on upload files icon to upload files and pictures from local disks, download from external drive,
  select documents from bixtrix24, and create files to upload.

    Given enter valid "<username>" and password
    When click "message" under activity stream
    Then click "upload files" under message
    And user click download from external drive
    Then user click office365

    Then user click dropbox


    Scenarios: :
  | username                      |
  | helpdesk51@cybertekschool.com |


  Scenario Template: AC1) select documents from bixtrix24

  AC1) User should be able to click on upload files icon to upload files and pictures from local disks, download from external drive,
  select documents from bixtrix24, and create files to upload.

    Given enter valid "<username>" and password
    When click "message" under activity stream
    Then click "upload files" under message
    And user click select doc from Bittrix
    And user select option from external pop up


    Scenarios: :
  | username                      |
  | helpdesk51@cybertekschool.com |


  Scenario Template: AC1) and create files to upload

  AC1) User should be able to click on upload files icon to upload files and pictures from local disks, download from external drive,
  select documents from bixtrix24, and create files to upload.

    Given enter valid "<username>" and password
    When click "message" under activity stream
    Then click "upload files" under message
    And user select option under desktop applications


    Scenarios: :
  | username                      |
  | helpdesk51@cybertekschool.com |


  @47
  Scenario Template: AC2)

  AC2) User should be able to add users from selecting contact from E-mail user, Employees and Departments and Recent contact lists.

    Given enter valid "<username>" and password
    When click "message" under activity stream
    And make to default
    Then click add persons groups department
    And click email users
    And click employes and departments
    And click recents
    And close pop up
    And add your "message"



    Scenarios: :
  | username                      |
  | helpdesk51@cybertekschool.com |


  Scenario Template: AC3)

  AC3) User should be able to attach link by clicking on the link icon.

    Given enter valid "<username>" and password
    When click "message" under activity stream
    And click "link" under message
    Then enter text of link value "value"
    And enter link of link value "value"
    And save link






    Scenarios: :
  | username                      |
  | helpdesk51@cybertekschool.com |









