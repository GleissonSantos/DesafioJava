package pages;

import base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProdutoPage extends PageBase {
    public ProdutoPage(WebDriver driver) {
        super(driver);
    }

    //mapeamento

    By comprarButton = By.id("btn-buy");

    //Ação

    public CarrinhoPage clicarComprarButton(){click(comprarButton);
    return new CarrinhoPage(driver);}
}
