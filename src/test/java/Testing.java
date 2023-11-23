import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class Testing extends ChromeRunner {

    @Test
    public void Test1() {
       $(byText("ჩემი კაბინეტი")).click();
       $(By.xpath("//*[@id=\"register\"]")).click();
        $("#UserName").setValue("ani.lomkatsi@yahoo.com").shouldBe(Condition.visible);
        $("#Password").setValue("Banana123").shouldNotBe(Condition.empty);
        $("#ConfirmPassword").setValue("Banana123").shouldNotBe(Condition.empty);
        $("#checkbox-button-1").click();
        Assert.assertTrue($(byId("#registrationButton")).is(Condition.enabled));
        sleep(5000);



            }
        }




