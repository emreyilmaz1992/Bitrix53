Feature: Users interaction
  AC#12:As a user, I should be able to interact with employees on the posts that I have access to.
  @Interact
  Scenario: Users interaction functionality


    Given User is on the landing page
    Then User makes comment, likes and unfollows the other employee
    Then User likes other viewer's comment,make comments and like
    Then User hover over the viewers, clicks their name and visit their profiles

  Scenario: User should be able to click on reviewers' name and visit their profiles.










    #1. User should be able to make a comment, like, or unfollow on other employees' posts.
    #2. User should be able to view, like, or make comments on all other reviewers's comments.
    #3. User should be able to click on reviewers' name and visit their profiles.
    #4. User should be able to add others' posts to favorate by clicking on the Star icon.