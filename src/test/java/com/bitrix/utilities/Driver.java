package com.bitrix.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class Driver {

    private Driver(){

    }

    private static WebDriver driver;

    public static WebDriver getDriver(){

        if(driver==null){
            String browser = ConfigurationReader.getProperty("browser");

            switch (browser){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    Driver.getDriver().manage().window().maximize();
                    Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case"firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    Driver.getDriver().manage().window().maximize();
                    Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case"chrome-headless":
                    WebDriverManager.firefoxdriver().setup();
                    driver  =new ChromeDriver(new ChromeOptions().setHeadless(true));
                    Driver.getDriver().manage().window().maximize();
                    Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case"firefox-headless":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver(new FirefoxOptions().setHeadless(true));
            }

        }
        return driver;

    }


    public static void closeDriver(){
        if(driver != null){
            driver.quit();
            driver=null;
        }
    }




}
