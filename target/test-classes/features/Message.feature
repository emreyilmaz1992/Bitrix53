
Feature: Message feature
  US-1:  As a user, I should be able to send messages by sending clicking on Message tab under Active Stream


  Background: User should be on the message tab by clicking message

    Given User is on the message tab
  @uploadDownload
    Scenario: User should be able to click on upload files icon to upload files and pictures from local disks,
    download from external drive, select documents from bixtrix24, and create files to upload.
      When User clicks on upload files icon
      Then User  upload files and pictures from local disks
      Then User downloads from external drive
      Then User selects documents from bitrix
      Then User creates files to upload

    Scenario: User should be able to add users from selecting contact from E-mail user,
    Employees and Departments and Recent contact lists
      When User clicks on Add more
      Then User clicks Employees and departments
      Then User chooses first email
      Then User clicks on E-mail users
      Then User types an e-mail

