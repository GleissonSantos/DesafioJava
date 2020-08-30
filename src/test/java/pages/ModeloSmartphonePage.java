package pages;

import base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ModeloSmartphonePage extends PageBase {
    public ModeloSmartphonePage(WebDriver driver) {
        super(driver);
    }

    //Mapeamento
    public By modeloSmartPhone(String nomeCompletoproduto){ return By.xpath("//h2[contains(text(), '"+ nomeCompletoproduto +"')]");}

    //Ação
    public ProdutoPage clicarNoSmartPhoneDaLista(String nomeProduto){ click(modeloSmartPhone(nomeProduto)); return new ProdutoPage(driver);}

}
