package pages;

import base.PageBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HomePage extends PageBase{
    public HomePage(WebDriver driver) {
        super(driver);
    }




    //Mapeamento
    By clicarBarraPesquisa = By.id("lgpd-accept");
    By clicarBuscarButton = By.id("h_search-input");



    //Ações
    public void clicarNaBarraPesquisa() {
        click(clicarBarraPesquisa);
    }

     public void clicarEmBuscar(){
        click(clicarBuscarButton);
    }


//        driver.findElement(By.id("lgpd-accept")).click();
//        driver.findElement(By.id("h_search-input")).click();
//        driver.findElement(By.id("h_search-input")).sendKeys("Console ps4");
//        driver.findElement(By.id("h_search-btn")).click();
//        String resultado = driver.findElement(By.xpath("//div[@class='form-group display-sm-inline-block']")).getText();
//        Assert.assertNotEquals("0", resultado);
//        driver.findElement(By.xpath("//h2[contains(text(), 'Console Playstation 4 Hits 1TB Bundle 10 - Gran Turismo + Death Stranding + The Last of Us - PS4')]")).click();
//        driver.findElement(By.id("btn-buy")).click();
//        driver.findElement(By.id("btn-continue")).click();
//        String nomePagina = driver.findElement(By.xpath("//h2[@class='page-title']")).getText();
//        Assert.assertEquals("Meu carrinho",nomePagina);
//        String qtdPedido = driver.findElement(By.xpath("//input[@name='productQuantity']")).getText();
//        Assert.assertEquals("1",qtdPedido);
//        driver.quit();

    }
