package pages;

import base.PageBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HomePage {
    private  WebDriver driver;

    //construtor
    public HomePage(WebDriver driver){
    this.driver = driver;
}


    public void adicionarItemNoCarrinho(){

    //abrir o navegador
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Gleisson\\Desktop\\Pasta Pessoal\\Desafio\\desafioZup\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    //navegar para o site
        driver.get("https://www.submarino.com.br/");
        driver.manage().window().maximize();

        driver.findElement(By.id("lgpd-accept")).click();
        driver.findElement(By.id("h_search-input")).click();
        driver.findElement(By.id("h_search-input")).sendKeys("Console ps4");
        driver.findElement(By.id("h_search-btn")).click();
        String resultado = driver.findElement(By.xpath("//div[@class='form-group display-sm-inline-block']")).getText();
        Assert.assertNotEquals("0", resultado);
        driver.findElement(By.xpath("//h2[contains(text(), 'Console Playstation 4 Hits 1TB Bundle 10 - Gran Turismo + Death Stranding + The Last of Us - PS4')]")).click();
        driver.findElement(By.id("btn-buy")).click();
        driver.findElement(By.id("btn-continue")).click();
        String nomePagina = driver.findElement(By.xpath("//h2[@class='page-title']")).getText();
        Assert.assertEquals("Meu carrinho",nomePagina);
        String qtdPedido = driver.findElement(By.xpath("//input[@name='productQuantity']")).getText();
        Assert.assertEquals("1",qtdPedido);
        driver.quit();

    }
}
