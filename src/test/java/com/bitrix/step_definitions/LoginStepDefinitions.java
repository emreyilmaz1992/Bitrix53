package com.bitrix.step_definitions;

import com.bitrix.pages.Login;
import com.bitrix.utilities.ConfigurationReader;
import com.bitrix.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginStepDefinitions {
    Login login = new Login();

    @When("User types username {string}")
    public void userTypesUsername(String userNames) {

        login.usernameInput.clear();
        login.usernameInput.sendKeys(userNames);

    }

    @When("User types password password")
    public void userTypesPasswordPassword() {
        login.passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        login.loginButton.click();
    }

    @Then("User should see Portal in the title")
    public void userShouldSeePortalInTheTitle() throws Exception {
        String expected = "Portal";
        String actual = Driver.getDriver().getTitle();
        Assert.assertTrue(actual.contains(expected));


        Thread.sleep(2000);
       Driver.getDriver().findElement(By.xpath("//span[@class='user-img user-default-avatar']")).click();
       Driver.getDriver().findElement(By.xpath("//span[.='Log out']")).click();



    }
}
