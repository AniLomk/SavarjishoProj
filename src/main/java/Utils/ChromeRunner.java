package Utils;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.module.Configuration;
import java.rmi.server.ServerNotActiveException;

import static com.codeborne.selenide.Selenide.open;

public class ChromeRunner {

    @BeforeMethod
    public void setUp() {

        open("https://www.gpih.ge/ka");


    }

    @AfterMethod
    public void tearDown() {

        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.closeWindow();
        Selenide.closeWebDriver();

    }
}