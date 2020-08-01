package com.bitrix.pages;

import com.bitrix.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivityStream {
    public ActivityStream(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-message']")
    public WebElement messageTab;

    @FindBy(xpath = "//span[@id='bx-b-uploadfile-blogPostForm']")
    public WebElement uploadFilesIcon;
    @FindBy(xpath = "//span[@class='feed-add-post-destination feed-add-post-destination-all-users']")
    public WebElement allemployees;
    @FindBy(xpath = "//a[@id='bx-destination-tag']")
    public WebElement addMore;
    @FindBy(xpath = "((//table[@class='diskuf-selector-table wd-fa-add-file-light-table'])[1]/tbody/tr/td)[1]")
    public WebElement uploadFilesAndImages;
    @FindBy(xpath = "((//table[@class='diskuf-selector-table wd-fa-add-file-light-table'])[1]/tbody/tr/td)[3]")
    public WebElement selectDocumentFromBitrix24;
    @FindBy(xpath = "((//table[@class='diskuf-selector-table wd-fa-add-file-light-table'])[1]/tbody/tr/td)[5]")
    public WebElement downloadFromExternalDrive;
    @FindBy(xpath = "((//table[@class='diskuf-selector-table wd-fa-add-file-light-table'])[1]/tbody/tr/td)[7]")
    public WebElement createFilesUsingDesktopApps;
    @FindBy(xpath = "(//button[@class='ui-btn ui-btn-lg ui-btn-primary'])[1]")
    public WebElement sendButton;

    @FindBy(xpath = "//a[@class='bx-file-dialog-content-link bx-file-dialog-icon bx-file-dialog-icon-file']")
    public WebElement selectTestDocumentFromBitrix;

    @FindBy(xpath = "//div[@class='popup-window-buttons']/span[1]" )
    public WebElement selectDocumentButton;

    @FindBy(xpath = "//div[@class='popup-window-buttons']/span[2]")
    public WebElement cancelButton;









}
