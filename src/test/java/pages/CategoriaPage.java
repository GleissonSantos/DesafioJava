package pages;

import base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoriaPage extends PageBase {
    public CategoriaPage(WebDriver driver) {
        super(driver);
    }

    //mapeamento

    By clicarModeloIphone = By.xpath("//a[@href='/categoria/celulares-e-smartphones/smartphone/iphone?ordenacao=topSelling']");
    public By clicarModelo(String modelo){return By.xpath("//a//span[text()='"+modelo+"']");}
    public By clicarMarca(String marca){return By.xpath("//a//span[text()='"+marca+"']");}

    //ações
    public CategoriaPage clicarNoModeloDesejado(){
      waitForElementToBeClickable(By.xpath("//div[@id='collapse-categorias']/ul/li[2]/a/span"));
      click(clicarModeloIphone); return this; }

    public CategoriaPage clicarNaMarcaDesejada(String marcaDesejada){
        waitForElementToBeClickable(By.xpath("//div[@id='collapse-categorias']/ul/li[2]/a/span"));
        click(clicarMarca(marcaDesejada)); return this; }
    public ModeloSmartphonePage clicarNoModeloEspecifico(String modeloSmartPhone){ click(clicarModelo(modeloSmartPhone)); return new ModeloSmartphonePage(driver); }

}

