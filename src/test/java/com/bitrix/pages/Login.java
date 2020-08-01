package com.bitrix.pages;

import com.bitrix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

    public Login(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement loginButton;




}
