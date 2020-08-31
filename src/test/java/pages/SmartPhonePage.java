package pages;

import base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SmartPhonePage extends PageBase {
    public SmartPhonePage(WebDriver driver) {
        super(driver);
    }

    //Mapeamento
    By clicarDesconto =  By.xpath("//span[text()='De 10% até 30%']");
    By clicarMenuLateral = By.xpath("//a[@href='/categoria/celulares-e-smartphones/smartphone?ordenacao=topSelling']");
    By descontoAplicado = By.className("//a//span[@class='aggregation-title']");
    public By clicarMarca(String marca){return By.xpath("//span[@class='link-list-text'][text()='"+marca+"']");}
    public By clicarSmartPhoneLista(String item){ return By.xpath("//div//h2[contains(text(),'"+item+"')]");}
    public By clicarCategoria(String modelo){return By.xpath("//a//span[text()='"+modelo+"']");}

    //Ações
    public CategoriaPage clicarCategoriaSmarPhoneMenuLateral(){waitForElementToBeClickable(clicarMenuLateral); click(clicarMenuLateral); return new CategoriaPage(driver); }
    public CategoriaPage clicarCategoriaMenuLateral(String categoria){waitForElementToBeClickable(clicarCategoria(categoria)); click(clicarCategoria(categoria)); return new CategoriaPage(driver); }

}
