package PageObject;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {
    public SelenideElement
    regBtn = $(byText("ჩემი კაბინეტი")),
    regPage = $(By.xpath("//*[@id=\"register\"]")),
    emailInput = $("#UserName"),
    passwordInput= $("#Password"),
    confirmPasswordInput = $("#ConfirmPassword"),
    registrationButtonInput =$(byId("#registrationButton"));



}
