@us5
Feature: US-5
  As a user, I should be able to send files
  by selecting File subheading from ""More"" tab under Activity Stream.

  1. User should be able to click on upload files icon to upload files and pictures from local disks,
  download from external drive, select documents from bixtrix24, and create files to upload.


  @login  @logOut
  Scenario Template: Uploading files and images

  AC-1) User should be able to click on upload files icon to upload files and pictures from local disks,
  download from external drive, select documents from bixtrix24, and create files to upload.


    And enter valid "<username>" and password
    When user click more under Activity stream
    And user click "file" under more
    Then user click upload file and images



    Scenarios: :
  | username                      |
  | helpdesk51@cybertekschool.com |


  @login @logOut
  Scenario Template: Download from external Drive

  AC-1) User should be able to click on upload files icon to upload files and pictures from local disks,
  download from external drive, select documents from bixtrix24, and create files to upload.


    And enter valid "<username>" and password
    When user click more under Activity stream
    And user click "file" under more
    Then user click download from external drive
    Then user click office365
    Then user click google drive
    Then user click dropbox




    Scenarios: :
  | username                      |
  | helpdesk51@cybertekschool.com |

  @login @logOut
  Scenario Template: Select Document From Bittrix24

  AC-1) User should be able to click on upload files icon to upload files and pictures from local disks,
  download from external drive, select documents from bixtrix24, and create files to upload.


    And enter valid "<username>" and password
    When user click more under Activity stream
    And user click "file" under more
    Then user click select doc from Bittrix
    And user select option from external pop up






    Scenarios: :
  | username                      |
  | helpdesk51@cybertekschool.com |

  @login @logOut
  Scenario Template: create files to upload

  AC-1) User should be able to click on upload files icon to upload files and pictures from local disks,
  download from external drive, select documents from bixtrix24, and create files to upload.


    And enter valid "<username>" and password
    When user click more under Activity stream
    And user click "file" under more
    Then user select option under desktop applications






    Scenarios: :
  | username                      |
  | helpdesk51@cybertekschool.com |


