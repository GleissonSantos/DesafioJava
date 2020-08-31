package base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {
    protected WebDriver driver;
    protected WebDriverWait wait = null;
    protected JavascriptExecutor javaScriptExecutor = null;


    //construtor
    public PageBase(WebDriver driver) {
        this.driver = driver;
    }

    protected void click(By element){
        driver.findElement(element).click();
    }

    protected void sendKeys(String locator, String text ){
        driver.findElement(By.id(locator)).sendKeys(text);
    }

    protected String getText(By locator){
        String text = driver.findElement(locator).getText();
        return text;
    }

   protected WebElement waitForElement(By locator){
       new WebDriverWait(driver, 10)
       .until(ExpectedConditions.presenceOfElementLocated((locator)));
       return null;
   }

    protected void waitForElementToBeClickable(By locator){
        WebDriverWait aguardar = new WebDriverWait(driver,20);
        aguardar.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }

}
