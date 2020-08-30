package base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import suport.Web;

import java.util.concurrent.TimeUnit;

public class PageBase {
    protected WebDriver driver;

    //construtor
    public PageBase(WebDriver driver) {
        this.driver = driver;
    }

    public void abrirNavegador() {

        //abrir o navegador
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gleisson\\Desktop\\Pasta Pessoal\\Desafio\\desafioZup\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //navegar para o site
        driver.get("https://www.submarino.com.br/");
        driver.manage().window().maximize();

    }

    protected void click(By element){
        driver.findElement(element).click();
    }


}
