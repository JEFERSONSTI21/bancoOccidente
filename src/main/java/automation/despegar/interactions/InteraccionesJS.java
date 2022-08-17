package automation.despegar.interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InteraccionesJS {

    public static void removeReadOnly (WebDriver driver, By localizador){
        WebElement input = driver.findElement(localizador);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].removeAttribute('readonly','readonly')", input);
    }

    public static void removeWarningDoubleSession (WebDriver driver){
        WebElement divFade = driver.findElement(By.id("overlay-background"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].removeAttribute('style')", divFade);
    }
}
