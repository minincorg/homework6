package homework5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckMenuFriends {
    private static WebDriver driver;

    public CheckMenuFriends(WebDriver driver) {
        this.driver = driver;
    }
    public void menuFriends(){
        driver.findElement(By.xpath("//div[@class=\"s-header__nav\"]/ul/li[2]/a")).click();
    }
}
