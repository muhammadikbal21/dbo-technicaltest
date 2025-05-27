package stepDefinitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.SuccessCheckoutPage;
import utils.WaitUtils;

public class SuccessCheckoutSteps {

    private SuccessCheckoutPage successCheckoutPage;
    private WebDriver driver = Hooks.driver;

    public SuccessCheckoutSteps() {
        this.successCheckoutPage = new SuccessCheckoutPage(driver);
    }

    @When("click add to cart button")
    public void clickAddToCartButton() throws InterruptedException {
        Thread.sleep(1000);
        WebElement addProductElement = WaitUtils.waitForElementToBeVisible(successCheckoutPage.getAddToCartButton());

        Assert.assertTrue("add product should be clickable", addProductElement.isEnabled());
        addProductElement.click();

        WaitUtils.waitForElementToBeVisible(successCheckoutPage.getSuccessAddedProductModal());
    }

    @And("click view cart textbutton")
    public void clickViewCartTextbutton() throws InterruptedException {
        Thread.sleep(2000);
        WebElement viewCartTextElement = WaitUtils.waitForElementToBeVisible(successCheckoutPage.getViewCartTextButton());

        Assert.assertTrue("view cart textbutton should be clickable", viewCartTextElement.isEnabled());
        viewCartTextElement.click();

        String expectedUrl = "https://www.automationexercise.com/view_cart";
        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(actualUrl, expectedUrl);
    }

    @And("click proceed to checkout button")
    public void clickProceedToCheckoutButton() throws InterruptedException {
        Thread.sleep(2000);
        WebElement proceedToCheckoutElement = WaitUtils.waitForElementToBeVisible(successCheckoutPage.getProceedToCheckoutButton());

        Assert.assertTrue("proceed to checkout button should be clickable", proceedToCheckoutElement.isEnabled());
        proceedToCheckoutElement.click();

        String expectedUrl = "https://www.automationexercise.com/checkout";
        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(actualUrl, expectedUrl);
    }

    @And("click place order button")
    public void clickPlaceOrderButton() throws InterruptedException {
        Thread.sleep(2000);
        WebElement placeOrderElement = WaitUtils.waitForElementToBeVisible(successCheckoutPage.getPlaceOrderButton());

        Assert.assertTrue("place order button should be clickable", placeOrderElement.isEnabled());
        placeOrderElement.click();

        String expectedUrl = "https://www.automationexercise.com/payment";
        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(actualUrl, expectedUrl);
    }

    @And("input name card {string}")
    public void inputNameCard(String namecard) throws InterruptedException {
        Thread.sleep(2000);
        WebElement nameCardElement = WaitUtils.waitForElementToBeVisible(successCheckoutPage.getNameCardField());

        nameCardElement.sendKeys(namecard);

        String expectedNameCardInput = nameCardElement.getAttribute("value");
        Assert.assertEquals("Name Card input mismatch", expectedNameCardInput, namecard);
    }

    @And("input card number {string}")
    public void inputCardNumber(String cardnumber) throws InterruptedException {
        Thread.sleep(1000);
        WebElement cardNumberElement = WaitUtils.waitForElementToBeVisible(successCheckoutPage.getCardNumberField());

        cardNumberElement.sendKeys(cardnumber);

        String expectedCardNumberInput = cardNumberElement.getAttribute("value");
        Assert.assertEquals("Card Number input mismatch", expectedCardNumberInput, cardnumber);
    }

    @And("input cvc {string}")
    public void inputCvc(String cvc) throws InterruptedException {
        Thread.sleep(1000);
        WebElement cvcElement = WaitUtils.waitForElementToBeVisible(successCheckoutPage.getCvcField());

        cvcElement.sendKeys(cvc);

        String expectedCvcInput = cvcElement.getAttribute("value");
        Assert.assertEquals("CVC input mismatch", expectedCvcInput, cvc);
    }

    @And("input month expiration {string}")
    public void inputMonthExpiration(String month) throws InterruptedException {
        Thread.sleep(1000);
        WebElement monthExpirationElement = WaitUtils.waitForElementToBeVisible(successCheckoutPage.getMonthExpirationField());

        monthExpirationElement.sendKeys(month);

        String expectedMonthInput = monthExpirationElement.getAttribute("value");
        Assert.assertEquals("Month Expiration input mismatch", expectedMonthInput, month);
    }

    @And("input year expiration {string}")
    public void inputYearExpiration(String year) throws InterruptedException {
        Thread.sleep(1000);
        WebElement yearExpirationElement = WaitUtils.waitForElementToBeVisible(successCheckoutPage.getYearExpirationField());

        yearExpirationElement.sendKeys(year);

        String expectedYearInput = yearExpirationElement.getAttribute("value");
        Assert.assertEquals("Year Expiration input mismatch", expectedYearInput, year);
    }

    @And("click pay and confirm order button")
    public void clickPayAndConfirmOrderButton() throws InterruptedException {
        Thread.sleep(1000);
        WebElement payAndConfirmOrderElement = WaitUtils.waitForElementToBeVisible(successCheckoutPage.getPayAndConfirmOrderButton());

        Assert.assertTrue("pay and confirm order button should be clickable", payAndConfirmOrderElement.isEnabled());
        payAndConfirmOrderElement.click();
    }

    @Then("user success checkout the product")
    public void userSuccessCheckoutTheProduct() throws InterruptedException {
        Thread.sleep(1000);
        WebElement successOrderTitleElement = WaitUtils.waitForElementToBeVisible(successCheckoutPage.getSuccessOrderTitle());
        WebElement successWordingElement = WaitUtils.waitForElementToBeVisible(successCheckoutPage.getSuccessWording());

        String actualTitle = successOrderTitleElement.getText();
        String actualWording = successWordingElement.getText();

        Assert.assertEquals("ORDER PLACED!", actualTitle);
        Assert.assertEquals("Congratulations! Your order has been confirmed!", actualWording);
    }
}
