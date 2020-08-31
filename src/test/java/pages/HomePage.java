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
    By clicarAccCookies = By.id("lgpd-accept");
    By clicarBarraPesquisa = By.id("h_search-input");
    By clicarBuscarButton = By.id("h_search-btn");
    By clicarSubMenuSmartPhone = By.xpath("//span[text()='Smartphones']");


    //Ações

    public HomePage clicarAceitarCookies() {
        click(clicarAccCookies);
        return this;
    }


    public HomePage clicarNaBarraPesquisa() {
        click(clicarBarraPesquisa);
        return this;
    }

    public HomePage preencherCampo(String produto) {
        sendKeys("h_search-input", produto);
        return this;
    }

     public ResultadoBuscaPage clicarEmBuscar(){
        click(clicarBuscarButton);
        return new ResultadoBuscaPage(driver);
    }

    public SmartPhonePage clicarSmartPhone(){
        click(clicarSubMenuSmartPhone);
        return new SmartPhonePage(driver);
    }
}
