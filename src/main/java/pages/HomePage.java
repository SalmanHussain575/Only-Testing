package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.Utility;

public class HomePage extends WebTestBase
{
   @FindBy(xpath = "//a[text() = 'Drag and Drop']")
    WebElement dragdropele;

   @FindBy(xpath ="//span[text() = 'Visit MyTest Page']")
   WebElement newtab;

   @FindBy(xpath = "//a[text()='Table With Checkbox']")
    WebElement checkbox;


   public HomePage()
   {
       PageFactory.initElements(driver,this);
   }

   public void dragDropclick()
   {
       Utility.waitUntilElementToBeClickable(dragdropele);
   }
       public void checkBoxSelect()
       {
           Utility.waitUntilElementToBeClickable(checkbox);
       }

       public void newTabClick()
       {
           Utility.waitUntilElementToBeClickable(newtab);
       }
}
