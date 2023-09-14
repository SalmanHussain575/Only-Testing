package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.Utility;

public class CheckBox extends WebTestBase {

    @FindBy (xpath = "//input[@type = 'checkbox']//following::td[text()='Cat']")
    WebElement catCheckBox;

    @FindBy (xpath = "//input[@type = 'checkbox']//following::td[text()='Dog']")
    WebElement dogCheckBox;


    public CheckBox()
    {
        PageFactory.initElements(driver,this);
    }

    public void checkBox1()
    {
        Utility.waitUntilElementToBeClickable(catCheckBox);
    }

    public void checkBox2()
    {
        Utility.waitUntilElementToBeClickable(dogCheckBox);
    }

    public boolean checkBoxVerify()
    {
        return Utility.isSelectedVerify(catCheckBox);
        return Utility.isSelectedVerify(dogCheckBox);
    }
}
