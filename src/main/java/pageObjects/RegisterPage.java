package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

    private WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    By nameField = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]");
    By emailSignUp = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]");
    By signUpButton = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button");
    By passwordSignUp = By.xpath("//*[@id=\"password\"]");
    By firstnameField = By.xpath("//*[@id=\"first_name\"]");
    By lastnameField = By.xpath("//*[@id=\"last_name\"]");
    By addressField = By.xpath("//*[@id=\"address1\"]");
    By stateField = By.xpath("//*[@id=\"state\"]");
    By cityField = By.xpath("//*[@id=\"city\"]");
    By zipcodeField = By.xpath("//*[@id=\"zipcode\"]");
    By phoneNumberField = By.xpath("//*[@id=\"mobile_number\"]");
    By createAccountButton = By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button");
    By successRegisterTitle = By.xpath("//*[@id=\"form\"]/div/div/div/h2");
    By successRegisterWording = By.xpath("//*[@id=\"form\"]/div/div/div/p[1]");

    public By getNameField() {
        return nameField;
    }

    public By getEmailSignUp() {
        return emailSignUp;
    }

    public By getSignUpButton() {
        return signUpButton;
    }

    public By getPasswordSignUp() {
        return passwordSignUp;
    }

    public By getFirstnameField() {
        return firstnameField;
    }

    public By getLastnameField() {
        return lastnameField;
    }

    public By getAddressField() {
        return addressField;
    }

    public By getStateField() {
        return stateField;
    }

    public By getCityField() {
        return cityField;
    }

    public By getZipcodeField() {
        return zipcodeField;
    }

    public By getPhoneNumberField() {
        return phoneNumberField;
    }

    public By getCreateAccountButton() {
        return createAccountButton;
    }

    public By getSuccessRegisterTitle() {
        return successRegisterTitle;
    }

    public By getSuccessRegisterWording() {
        return successRegisterWording;
    }
}
