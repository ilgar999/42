package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(xpath = "(//span[@class='nav-line-1 nav-progressive-content'])[2]")
    public WebElement loginPage;

    @FindBy(id = "ap_email")
    public WebElement username;

    @FindBy(id = "continue")
    public WebElement continueButton;

    @FindBy(id = "ap_password")
    public WebElement password;

    @FindBy(id = "signInSubmit")
    public WebElement SignIn;

}
