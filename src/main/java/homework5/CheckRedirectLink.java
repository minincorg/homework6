package homework5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckRedirectLink {
    private static WebDriver driver;

    public CheckRedirectLink(WebDriver driver) {
        this.driver = driver;
    }
    public void checkVKLink(){
        driver.findElement(By.xpath("//ul[@class =\"main-footer__social-list\" ]/li[1]")).click();
    }
}
