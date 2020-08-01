package com.bitrix.step_definitions;

import com.bitrix.pages.ActivityStream;
import com.bitrix.pages.LandingPage;
import com.bitrix.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Ignore;

public class MessageTabStepDefinitions  extends LandingPage {
    ActivityStream activityStream = new ActivityStream();

    @Given("User is on the message tab")
    public void userIsOnTheMessageTab() throws Exception {
        Thread.sleep(2000);
        activityStream.messageTab.click();
        Thread.sleep(2000);

    }

    @When("User clicks on upload files icon")
    public void userClicksOnUploadFilesIcon() {
        activityStream.uploadFilesIcon.click();

    }

    @Then("User  upload files and pictures from local disks")
    public void userUploadFilesAndPicturesFromLocalDisks()throws Exception {
        Thread.sleep(2000);

//       activityStream.uploadFilesAndImages.sendKeys("/Users/emre/Desktop/test.png");
//       Thread.sleep(3000);
//       activityStream.uploadFilesAndImages.click();
        activityStream.uploadFilesAndImages.isEnabled();
        activityStream.createFilesUsingDesktopApps.isDisplayed();
        activityStream.createFilesUsingDesktopApps.isEnabled();
        activityStream.selectDocumentFromBitrix24.isDisplayed();
        activityStream.selectDocumentFromBitrix24.isEnabled();
        activityStream.downloadFromExternalDrive.isDisplayed();
        activityStream.downloadFromExternalDrive.isEnabled();


    }

    @Then("User downloads from external drive")
    public void userDownloadsFromExternalDrive() {
        downloadFromExternalDrive.isEnabled();
        downloadFromExternalDrive.isDisplayed();

    }


    @Ignore
    @Then("User creates files to upload")
    public void userCreatesFilesToUpload() {
       // selectDocumentFromBitrix24.click();


    }

    @Then("User selects documents from bitrix")
    public void userSelectsDocumentsFromBitrix() {
        BrowserUtils.wait(2);
        selectDocumentFromBitrix24.click();
       // selectTestDocumentFromBitrix.click();
       // selectDocumentButton.click();



    }
}
