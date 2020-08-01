package com.bitrix.step_definitions;

import com.bitrix.pages.LandingPage;
import com.bitrix.utilities.BrowserUtils;
import com.bitrix.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

import static org.junit.Assert.assertTrue;

public class Download_StepDefinitions extends LandingPage {
    @When("User is on the landing page")
    public void userIsOnTheLandingPage() {
        BrowserUtils.wait(2);
        String expected = "Portal";
        String actual = Driver.getDriver().getTitle();
        Assert.assertTrue(actual.contains(expected));

    }

    @Then("User clicks on MAC OS icon to download bitrix for desktop")
    public void userClicksOnMACOSIconToDownloadBitrixForDesktop() {

        BrowserUtils.scrollToElement(macOsDesktopIcon);
        macOsDesktopIcon.click();

    }

    @Then("User clicks on Windows icon to download bitrix for desktop")
    public void userClicksOnWindowsIconToDownloadBitrixForDesktop() {
        BrowserUtils.wait(2);
        windowsDesktopIcon.click();
    }

    @Then("User clicks on Linux icon to download bitrix for desktop")
    public void userClicksOnLinuxIconToDownloadBitrixForDesktop() {
        BrowserUtils.wait(2);
        linuxDesktopIcon.click();
    }
}
