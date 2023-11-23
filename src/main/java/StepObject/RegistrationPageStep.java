package StepObject;

import DataObject.RegistrationPageData;
import PageObject.RegistrationPage;
import com.codeborne.selenide.Condition;

import java.time.Duration;

public class RegistrationPageStep extends RegistrationPage {
    public RegistrationPageStep GoToRegistrationPage() {
        regBtn.click();
        return this;
    }

    public RegistrationPageStep UserIsOnRegistrationPage() {
        regPage.shouldBe(Condition.visible, Duration.ofMillis(2000));
        return this;

    }


    public RegistrationPageStep FillEmail(String UserName) {
        emailInput.setValue(UserName);
        emailInput.shouldNotBe(Condition.empty);
        return this;

    }

    public RegistrationPageStep FillPassword(String password) {
        passwordInput.setValue(password);
        emailInput.shouldNotBe(Condition.empty);
        return this;
    }

    public RegistrationPageStep FillConfirmPassword(String ConfirmPassword) {
        confirmPasswordInput.setValue(ConfirmPassword);
        emailInput.shouldNotBe(Condition.empty);
        return this;

    }
}

