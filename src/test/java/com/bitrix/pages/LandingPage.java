package com.bitrix.pages;

import com.bitrix.utilities.Driver;
import io.cucumber.java.jv.Lan;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends ActivityStream {


    public LandingPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//div[@class='b24-app-block-content'])[1]/a[1]")
    public WebElement macOsDesktopIcon;
    @FindBy(xpath = "(//div[@class='b24-app-block-content'])[1]/a[2]")
    public WebElement windowsDesktopIcon;
    @FindBy(xpath = "(//div[@class='b24-app-block-content'])[1]/a[3]")
    public WebElement linuxDesktopIcon;
    @FindBy (xpath = "//a[@id='bp_542']")
    public WebElement employeePost;
    @FindBy(xpath = "(//span[contains(@id,'BLOG_POST_542-1596')])[1]")
    public WebElement likeButton;
    @FindBy(xpath = "//a[@id='blog-post-addc-add-542']")
    public WebElement commentButton;
    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement commentInput;

    @FindBy(xpath = "(//button[@class='ui-btn ui-btn-sm ui-btn-primary'])[1]")
    public WebElement sendButton;

    @FindBy(xpath = "//span[@id='log_entry_follow_1476']")
    public WebElement unfollowButton;
    @FindBy(xpath = "(//span[contains(@id,'bx-ilike-button-BLOG_COMMENT_28')])[1]")
    public WebElement reviewerLikeButton;

    @FindBy(xpath = "(//a[@bx-mpl-author-name='Nebraska Jim'])[1]")
    public WebElement reviewerReplyButton;

    @FindBy(xpath = "//*[contains(text(),'Test 123')]")
    public WebElement reviewerComment;

    @FindBy(xpath = "(//button[@class='ui-btn ui-btn-sm ui-btn-primary'])[1]")
    public WebElement reviewerSendButton;














}
