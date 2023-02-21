package homework5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {
    private static WebDriver driver;

    public Logout(WebDriver driver) {
        this.driver = driver;
    }
    public void setLogout(){
        //driver.findElement(By.xpath("//ul[@class=\"s-do\"]/li[2]")).click();
        driver.findElement(By.xpath("//ul[@class=\"s-do\"]/li[2]/ul/li[15]/a")).click();
    }
}
