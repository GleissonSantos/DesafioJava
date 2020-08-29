package suport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Web {

    public static WebDriver creatorChrome(){

        //abrir o navegador
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Gleisson\\Desktop\\Pasta Pessoal\\Desafio\\desafioZup\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //navegar para o site
        driver.get("https://www.americanas.com.br/");

        return driver;

    }
}
