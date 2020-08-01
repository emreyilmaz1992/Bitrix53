package com.bitrix.step_definitions;

import com.bitrix.pages.LandingPage;
import com.bitrix.utilities.BrowserUtils;
import com.bitrix.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Interaction_StepDefinitions extends BrowserUtils {
    LandingPage landingPage = new LandingPage();

    @Ignore
    @Then("User makes comment, likes and unfollows the other employee")
    public void userMakesCommentLikesAndUnfollowsTheOtherEmployee() {
    BrowserUtils.wait(2);
    BrowserUtils.scrollToElement(Driver.getDriver().findElement(By.xpath("//a[@id='bp_542']")));
    BrowserUtils.wait(2);


    landingPage.likeButton.isDisplayed();
    landingPage.likeButton.isEnabled();
    landingPage.likeButton.click();
    BrowserUtils.wait(2);


    BrowserUtils.wait(2);
    landingPage.commentButton.isDisplayed();
    landingPage.commentButton.click();
    BrowserUtils.wait(2);
    WebElement iframe = Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']"));

    Driver.getDriver().switchTo().frame(iframe);

    landingPage.commentInput.sendKeys("Test 123");
    Driver.getDriver().switchTo().defaultContent();
    BrowserUtils.wait(1);
    landingPage.sendButton.click();


    landingPage.unfollowButton.isEnabled();
    landingPage.unfollowButton.isDisplayed();
    landingPage.unfollowButton.click();


    }

    @Then("User likes other viewer's comment,make comments and like")
    public void userLikesOtherViewerSCommentMakeCommentsAndLike() {
        BrowserUtils.wait(2);
        BrowserUtils.scrollToElement(Driver.getDriver().findElement(By.xpath("//a[@id='bp_542']")));
        String expected = "Test 123";
        System.out.println(landingPage.reviewerComment.getText());
        String actual = landingPage.reviewerComment.getText();

        Assert.assertEquals(expected,actual);

        landingPage.reviewerLikeButton.click();
        landingPage.reviewerReplyButton.click();
        WebElement reviewerIframe= Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']"));
        Driver.getDriver().switchTo().frame(reviewerIframe);
        BrowserUtils.wait(2);
        landingPage.commentInput.sendKeys("Reply");
        BrowserUtils.wait(2);
        Driver.getDriver().switchTo().defaultContent();
        landingPage.reviewerSendButton.click();





    }

    @Then("User hover over the viewers, clicks their name and visit their profiles")
    public void userHoverOverTheViewersClicksTheirNameAndVisitTheirProfiles() {




    }
}
