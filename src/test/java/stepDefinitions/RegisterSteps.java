package stepDefinitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.LoginPage;
import pageObjects.RegisterPage;
import utils.WaitUtils;

public class RegisterSteps {

    private RegisterPage registerPage;
    private WebDriver driver = Hooks.driver;

    public RegisterSteps() {
        this.registerPage = new RegisterPage(driver);
    }

    @Given("user is on signup page")
    public void userIsOnSignupPage() {
        LoginPage loginPage = new LoginPage(driver);
        WebElement imageElement = WaitUtils.waitForElementToBeVisible(loginPage.getLoginImage());

        String expectedTitle = "Automation Exercise - Signup / Login";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);

        String expectedSrc = "https://www.automationexercise.com/static/images/home/logo.png";
        String actualSrc = imageElement.getAttribute("src");
        Assert.assertEquals(actualSrc, expectedSrc);
    }

    @When("input name {string}")
    public void inputName(String name) throws InterruptedException {
        Thread.sleep(1000);
        WebElement nameElement = WaitUtils.waitForElementToBeVisible(registerPage.getNameField());

        nameElement.sendKeys(name);

        String expectedNameInput = nameElement.getAttribute("value");
        Assert.assertEquals("Name input mismatch", expectedNameInput, name);
    }

    @And("input email")
    public void inputEmail() throws InterruptedException {
        Thread.sleep(1000);
        WebElement emailSignUpElement = WaitUtils.waitForElementToBeVisible(registerPage.getEmailSignUp());

        long timestamp = System.currentTimeMillis();
        String actualEmailSignUpInput = "ikbal" + timestamp + "@gmail.com";
        emailSignUpElement.sendKeys(actualEmailSignUpInput);

        String expectedEmailSignUpInput = emailSignUpElement.getAttribute("value");
        Assert.assertEquals("Email input mismatch", expectedEmailSignUpInput, actualEmailSignUpInput);
    }

    @And("click signup button")
    public void clickSignupButton() throws InterruptedException {
        Thread.sleep(1000);
        WebElement signUpButtonElement = WaitUtils.waitForElementToBeVisible(registerPage.getSignUpButton());

        signUpButtonElement.click();
    }

    @Then("user is navigated to account information page")
    public void userIsNavigatedToAccountInformationPage() throws InterruptedException {
        Thread.sleep(1000);
        WaitUtils.waitForTitle("Automation Exercise - Signup");

        String expectedUrl = "https://www.automationexercise.com/signup";
        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(actualUrl, expectedUrl);
    }

    @And("input password signup {string}")
    public void inputPasswordSignup(String password) throws InterruptedException {
        Thread.sleep(1000);
        WebElement passwordSignUpElement = WaitUtils.waitForElementToBeVisible(registerPage.getPasswordSignUp());

        passwordSignUpElement.sendKeys(password);

        boolean isPasswordType = "password".equals(passwordSignUpElement.getAttribute("type"));

        Assert.assertTrue("Password input mismatch", isPasswordType);
    }

    @And("input firstname {string}")
    public void inputFirstname(String firstname) throws InterruptedException {
        Thread.sleep(1000);
        WebElement firstnameElement = WaitUtils.waitForElementToBeVisible(registerPage.getFirstnameField());

        firstnameElement.sendKeys(firstname);

        String expectedFirstnameInput = firstnameElement.getAttribute("value");
        Assert.assertEquals("First Name input mismatch", expectedFirstnameInput, firstname);
    }

    @And("input lastname {string}")
    public void inputLastname(String lastname) throws InterruptedException {
        Thread.sleep(1000);
        WebElement lastnameElement = WaitUtils.waitForElementToBeVisible(registerPage.getLastnameField());

        lastnameElement.sendKeys(lastname);

        String expectedLastnameInput = lastnameElement.getAttribute("value");
        Assert.assertEquals("Last Name input mismatch", expectedLastnameInput, lastname);
    }

    @And("input address {string}")
    public void inputAddress(String address) throws InterruptedException {
        Thread.sleep(1000);
        WebElement addressElement = WaitUtils.waitForElementToBeVisible(registerPage.getAddressField());

        addressElement.sendKeys(address);

        String expectedAddressInput = addressElement.getAttribute("value");
        Assert.assertEquals("Address input mismatch", expectedAddressInput, address);
    }

    @And("input state {string}")
    public void inputState(String state) throws InterruptedException {
        Thread.sleep(1000);
        WebElement stateElement = WaitUtils.waitForElementToBeVisible(registerPage.getStateField());

        stateElement.sendKeys(state);

        String expectedStateInput = stateElement.getAttribute("value");
        Assert.assertEquals("State input mismatch", expectedStateInput, state);
    }

    @And("input city {string}")
    public void inputCity(String city) throws InterruptedException {
        Thread.sleep(1000);
        WebElement cityElement = WaitUtils.waitForElementToBeVisible(registerPage.getCityField());

        cityElement.sendKeys(city);

        String expectedCityInput = cityElement.getAttribute("value");
        Assert.assertEquals("City input mismatch", expectedCityInput, city);
    }

    @And("input zipcode {string}")
    public void inputZipcode(String zipcode) throws InterruptedException {
        Thread.sleep(1000);
        WebElement zipcodeElement = WaitUtils.waitForElementToBeVisible(registerPage.getZipcodeField());

        zipcodeElement.sendKeys(zipcode);

        String expectedZipcodeInput = zipcodeElement.getAttribute("value");
        Assert.assertEquals("Zipcode input mismatch", expectedZipcodeInput, zipcode);
    }

    @And("input phone number {string}")
    public void inputPhoneNumber(String phonenumber) throws InterruptedException {
        Thread.sleep(1000);
        WebElement phonenumberElement = WaitUtils.waitForElementToBeVisible(registerPage.getPhoneNumberField());

        phonenumberElement.sendKeys(phonenumber);

        String expectedPhonenumberInput = phonenumberElement.getAttribute("value");
        Assert.assertEquals("Phone Number input mismatch", expectedPhonenumberInput, phonenumber);
    }

    @And("click create account button")
    public void clickCreateAccountButton() throws InterruptedException {
        Thread.sleep(1000);
        WebElement createAccountButtonElement = WaitUtils.waitForElementToBeVisible(registerPage.getCreateAccountButton());

        // ini berfungsi sebagai scrolling agar button langsung diarahkan pada tempatnya dan tidak tertutupi iklan/ads pada web nya
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", createAccountButtonElement);

        createAccountButtonElement.click();
    }

    @Then("user success register account")
    public void userSuccessRegisterAccount() throws InterruptedException {
        Thread.sleep(1000);
        WebElement successRegisterTitleElement = WaitUtils.waitForElementToBeVisible(registerPage.getSuccessRegisterTitle());
        WebElement successRegisterWordingElement = WaitUtils.waitForElementToBeVisible(registerPage.getSuccessRegisterWording());

        String actualTitle = successRegisterTitleElement.getText();
        String actualWording = successRegisterWordingElement.getText();

        Assert.assertEquals("ACCOUNT CREATED!", actualTitle);
        Assert.assertEquals("Congratulations! Your new account has been successfully created!", actualWording);

        WaitUtils.waitForTitle("Automation Exercise - Account Created");

        String expectedUrl = "https://www.automationexercise.com/account_created";
        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(actualUrl, expectedUrl);
    }

}
