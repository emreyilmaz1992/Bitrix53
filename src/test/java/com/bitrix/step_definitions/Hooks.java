package com.bitrix.step_definitions;

import com.bitrix.pages.Login;
import com.bitrix.utilities.ConfigurationReader;
import com.bitrix.utilities.Driver;
import io.cucumber.java.Scenario;
import io.cucumber.java.an.E;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.cucumber.java.*;

public class Hooks {

    @Before
    public void setUpScenario()throws Exception {

        Login login = new Login();
        Driver.getDriver().get(ConfigurationReader.getProperty("bitrix24_url"));
        Thread.sleep(2000);
        login.usernameInput.sendKeys(ConfigurationReader.getProperty("username"));
        login.passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        login.loginButton.click();
        Thread.sleep(2000);




    }

    @After (value = "@DownloadApp")
    public void tearDownScenario(Scenario scenario){

        if(scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png",scenario.getName());
        }

        Driver.closeDriver();



    }

}
