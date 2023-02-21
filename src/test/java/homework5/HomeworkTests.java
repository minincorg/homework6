package homework5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomeworkTests extends AbstractHomeworkTests {
    WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

    @Test
    void test3() {
        LoginIn loginIn = new LoginIn(getDriver());
        loginIn.selectAuthorization();
        LoginIn.enterLogin();
        loginIn.enterPassword();
        loginIn.submit();
        Assertions.assertEquals("minincorg", "minincorg");
    }

    @Test
    void test4() {
        Logout logout = new Logout(getDriver());
        test3();
        logout.setLogout();
    }

    @Test
    void test5() {
        CheckRedirectLink checkRedirectLink = new CheckRedirectLink(getDriver());
        test3();
        checkRedirectLink.checkVKLink();
    }

    @Test
    void test6() {
        SelectLanguage selectLanguage = new SelectLanguage(getDriver());
        test3();
        selectLanguage.selectEnglish();
    }

    @Test
    void test7() throws InterruptedException {
        PostNewEntry postNewEntry = new PostNewEntry(getDriver());
        test3();
        postNewEntry.newMessage();
    }

    @Test
    void test8() {
        CheckMenuFriends checkMenuFriends = new CheckMenuFriends(getDriver());
        test3();
        checkMenuFriends.menuFriends();
    }
}
