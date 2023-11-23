import StepObject.RegistrationPageStep;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.RegistrationPageData.*;

public class RegistrationPageTests extends ChromeRunner {
    RegistrationPageStep RegistrationPagestep = new RegistrationPageStep();

    @Test
    public void RegistrationCheck() {
        RegistrationPagestep
                .GoToRegistrationPage()
                .UserIsOnRegistrationPage()
                .FillPassword(Password)
                .FillConfirmPassword(ConfirmPassword)
                .FillEmail (Username);





        Assert.assertTrue(RegistrationPagestep.regBtn.is(Condition.visible));




    }
}


