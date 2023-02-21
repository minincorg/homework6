package homework5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PostNewEntry {
    private static WebDriver driver;

    public PostNewEntry(WebDriver driver) {
        this.driver = driver;
    }
    public void newMessage() throws InterruptedException {
        driver.findElement(By.xpath("//nav[2]/ul/li[4]/a")).click();
        driver.findElement(By.xpath("//div[@id=\"editorWrapper\"]/div[1]/div[2]/div")).click();
        driver.findElement(By.xpath("//div[@id=\"editorWrapper\"]/div[1]/div[2]/div")).sendKeys("Привет!");
        driver.findElement(By.xpath("//div[@class=\"primSxn-0-2-236\"]/div[2]/button")).click();


    }
}
