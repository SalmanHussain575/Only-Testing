package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.ActionUtility;

public class DragDrop extends WebTestBase {

    @FindBy(xpath = "//p[text() ='Drag me to my target']")
    WebElement sourcePath;

    @FindBy(xpath = "//p[text() ='Drop here']")
    WebElement destinationPath;

    public DragDrop(){
        PageFactory.initElements(driver,this);
    }

    public void dragDropTest(){
        ActionUtility.dragDropElement(sourcePath,destinationPath);
    }

}

