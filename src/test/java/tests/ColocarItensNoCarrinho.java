package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import suport.Web;

public class ColocarItensNoCarrinho {
    private WebDriver driver;

    @Before
    public void setUp(){
        driver = Web.creatorChrome();
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
