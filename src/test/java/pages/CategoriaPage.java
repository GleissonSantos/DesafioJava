package pages;

import base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoriaPage extends PageBase {
    public CategoriaPage(WebDriver driver) {
        super(driver);
    }

    //mapeamento
    public By clicarModelo(String modelo){return By.xpath("//a//span[text()='"+modelo+"']");}
    By clicarModeloIphone = By.xpath("//a[@href='/categoria/celulares-e-smartphones/smartphone/iphone?ordenacao=topSelling']");
    //ações

    public ModeloSmartphonePage clicarNoModeloEspecifico(String modeloSmartPhone){click(clicarModelo(modeloSmartPhone)); return new ModeloSmartphonePage(driver); }
    public CategoriaPage clicarNoModeloDesejado(){click(clicarModeloIphone); return this; }
}
