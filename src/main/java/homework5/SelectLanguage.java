package homework5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectLanguage {
    private static WebDriver driver;

    public SelectLanguage(WebDriver driver) {
        this.driver = driver;
    }
    public void selectEnglish(){
        driver.findElement(By.xpath("//div[@class=\"main-footer__lang-select\"]")).click();
        driver.findElement(By.xpath("//div[@class=\"main-footer__lang-select\"]/div/div[3]/div/ul/li[1]")).click();
    }
}
