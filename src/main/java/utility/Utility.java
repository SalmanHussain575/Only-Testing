package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testbase.WebTestBase;

import java.time.Duration;

public class Utility  extends WebTestBase {
        public static final long IMPLICIT_WAIT = 40;
        public static final long PAGE_LOAD = 40;

        public static final long EXPLICIT_WAIT = 40;

        public static WebDriverWait wait;

        public static void waitUntilElementToBeClickable(WebElement element) {
            wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
            wait.until(ExpectedConditions.elementToBeClickable(element)).click();

        }

        public static boolean isSelectedVerify(WebElement element){
            return element.isSelected();
        }


    }
