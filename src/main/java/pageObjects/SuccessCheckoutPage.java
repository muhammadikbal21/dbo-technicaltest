package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuccessCheckoutPage {

    private WebDriver driver;

    public SuccessCheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    By addToCartButton = By.xpath("/html/body/section[2]/div/div/div[2]/div[1]/div[2]/div/div[1]/div[1]/a");
    By successAddedProductModal = By.xpath("//*[@id=\"cartModal\"]/div/div");
    By viewCartTextButton = By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a");
    By proceedToCheckoutButton = By.xpath("//*[@id=\"do_action\"]/div[1]/div/div/a");
    By placeOrderButton = By.xpath("//*[@id=\"cart_items\"]/div/div[7]/a");
    By nameCardField = By.xpath("//*[@id=\"payment-form\"]/div[1]/div/input");
    By cardNumberField = By.xpath("//*[@id=\"payment-form\"]/div[2]/div/input");
    By cvcField = By.xpath("//*[@id=\"payment-form\"]/div[3]/div[1]/input");
    By monthExpirationField = By.xpath("//*[@id=\"payment-form\"]/div[3]/div[2]/input");
    By yearExpirationField = By.xpath("//*[@id=\"payment-form\"]/div[3]/div[3]/input");
    By payAndConfirmOrderButton = By.xpath("//*[@id=\"submit\"]");
    By successOrderTitle = By.xpath("//*[@id=\"form\"]/div/div/div/h2");
    By successWording = By.xpath("//*[@id=\"form\"]/div/div/div/p");

    public By getAddToCartButton() {
        return addToCartButton;
    }

    public By getSuccessAddedProductModal() {
        return successAddedProductModal;
    }

    public By getViewCartTextButton() {
        return viewCartTextButton;
    }

    public By getProceedToCheckoutButton() {
        return proceedToCheckoutButton;
    }

    public By getPlaceOrderButton() {
        return placeOrderButton;
    }

    public By getNameCardField() {
        return nameCardField;
    }

    public By getCardNumberField() {
        return cardNumberField;
    }

    public By getCvcField() {
        return cvcField;
    }

    public By getMonthExpirationField() {
        return monthExpirationField;
    }

    public By getYearExpirationField() {
        return yearExpirationField;
    }

    public By getPayAndConfirmOrderButton() {
        return payAndConfirmOrderButton;
    }

    public By getSuccessOrderTitle() {
        return successOrderTitle;
    }

    public By getSuccessWording() {
        return successWording;
    }

}
