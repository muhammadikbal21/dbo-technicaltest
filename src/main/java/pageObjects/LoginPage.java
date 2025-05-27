package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By loginImage = By.xpath("//*[@id=\"header\"]/div/div/div/div[1]/div/a/img");
    By emailField = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]");
    By passwordField = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]");
    By loginButton = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button");

    public By getLoginImage() {
        return loginImage;
    }

    public By getEmailField() {
        return emailField;
    }

    public By getPasswordField() {
        return passwordField;
    }

    public By getLoginButton() {
        return loginButton;
    }
}
