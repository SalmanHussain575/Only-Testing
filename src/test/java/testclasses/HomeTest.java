package testclasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.CheckBox;
import pages.DragDrop;
import pages.HomePage;
import pages.NewTabPage;
import testbase.WebTestBase;

public class HomeTest extends WebTestBase {
    public CheckBox checkBox;
    public DragDrop dragDrop;
    public HomePage homePage;

    public NewTabPage newTabPage;

     HomeTest()
    {
        super();
    }
    @BeforeMethod
    public void beforeMethod(){
         initialization();
         homePage = new HomePage();
         checkBox = new CheckBox();
         dragDrop = new DragDrop();
         newTabPage = new NewTabPage();


    }

    @Test
    public void checkBoxVerify()
    {
        SoftAssert softAssert = new SoftAssert();
        homePage.checkBoxSelect();
        checkBox.checkBox1();
        checkBox.checkBox2();
        softAssert.assertAll();
    }


    @Test
    public void dragDropPerform()
    {
        SoftAssert softAssert = new SoftAssert();
        homePage.dragDropclick();
        dragDrop.dragDropTest();

    }

    @Test
    public void openNewTab()
    {
        SoftAssert softAssert = new SoftAssert();
        homePage.newTabClick();

    }


    @AfterMethod
    public void  teardown()
    {
        driver.close();
    }

}
