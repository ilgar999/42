package com.amazon.step_definitions;

import com.amazon.pages.LoginPage;
import com.amazon.utilities.BrowserUtils;
import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class login_stepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("User on the login page")
    public void user_on_the_login_page() {
        String url = ConfigurationReader.getProperty("URL");
        Driver.getDriver().get(url);
    }

    @When("User click login page")
    public void user_click_login_page() {
        loginPage.loginPage.click();
    }

    @Then("User should add username and password")
    public void user_should_add_username_and_password() {
        loginPage.username.sendKeys("ilqar.nureddinoglu@gmail.com");
        loginPage.continueButton.click();

        BrowserUtils.sleep(2);

        loginPage.password.sendKeys("Aybeniz1957@");
    }

    @And("User should click login button")
    public void user_should_click_login_button() {
        loginPage.SignIn.click();
        BrowserUtils.sleep(1);
    }

    @Then("User should see amazon page")
    public void user_should_see_amazon_page() {

        String actualTitle = "Amazon.com. Spend less. Smile more.";
        String expectedTitle = Driver.getDriver().getTitle();


        BrowserUtils.sleep(2);
        Assert.assertEquals("This is the title of Amazon", expectedTitle, actualTitle);

    }
}
