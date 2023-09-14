package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import testbase.WebTestBase;

public class ActionUtility extends WebTestBase {

    public static Actions actions;

    public static void dragDropElement(WebElement srcElement, WebElement destElement){
        actions = new Actions(driver);
        actions.dragAndDrop(srcElement, destElement).perform();
    }
}
