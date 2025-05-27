package stepDefinitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.LoginPage;
import utils.WaitUtils;

public class LoginSteps {

    private LoginPage loginPage;
    private WebDriver driver = Hooks.driver;

    public LoginSteps() {
        this.loginPage = new LoginPage(driver);
    }

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        WebElement imageElement = WaitUtils.waitForElementToBeVisible(loginPage.getLoginImage());

        String expectedTitle = "Automation Exercise - Signup / Login";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);

        String expectedSrc = "https://www.automationexercise.com/static/images/home/logo.png";
        String actualSrc = imageElement.getAttribute("src");
        Assert.assertEquals(actualSrc, expectedSrc);
    }

    @When("input email {string}")
    public void inputEmail(String email) {
        WebElement emailElement = WaitUtils.waitForElementToBeVisible(loginPage.getEmailField());

        emailElement.sendKeys(email);

        // ini berfungsi untuk mengambil nilai dari field email agar dapat diperiksa
        String expectedEmailInput = emailElement.getAttribute("value");
        Assert.assertEquals("Email input mismatch", expectedEmailInput, email);
    }

    @And("input password {string}")
    public void inputPassword(String password) {
        WebElement passwordElement = WaitUtils.waitForElementToBeVisible(loginPage.getPasswordField());

        passwordElement.sendKeys(password);

        // ini mengecek apakah field password bertipe "password" (untuk memastikan teks disembunyikan)
        boolean isPasswordType = "password".equals(passwordElement.getAttribute("type"));
        // Asersi untuk memastikan password terisi
        Assert.assertTrue("Password input mismatch", isPasswordType);
    }

    @And("click login button")
    public void clickLoginButton() {
        WebElement loginButtonElement = WaitUtils.waitForElementToBeVisible(loginPage.getLoginButton());

        loginButtonElement.click();
    }

    @Then("user is navigated to the home page")
    public void userIsNavigatedToTheHomePage() {
        WaitUtils.waitForTitle("Automation Exercise");

        String expectedUrl = "https://www.automationexercise.com/";
        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(actualUrl, expectedUrl);
    }

}
