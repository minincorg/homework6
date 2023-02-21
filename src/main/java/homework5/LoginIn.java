package homework5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginIn {
    private static WebDriver driver;

    public LoginIn(WebDriver driver) {
        this.driver = driver;
    }

    public void selectAuthorization() {
        driver.findElement(By.cssSelector(".s-header-item__link--login")).click();
    }

    public static void enterLogin() {
        driver.findElement(By.id("user")).click();
        driver.findElement(By.id("user")).sendKeys("minincorg");
    }

    public void enterPassword() {
        driver.findElement(By.id("lj_loginwidget_password")).click();
        driver.findElement(By.id("lj_loginwidget_password")).sendKeys("Aa12042003");
    }

    public void submit() {
        driver.findElement(By.name("action:login")).click();
    }
}

