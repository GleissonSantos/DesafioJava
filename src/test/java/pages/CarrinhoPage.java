package pages;

import base.PageBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarrinhoPage extends PageBase {
    public CarrinhoPage(WebDriver driver) {
        super(driver);
    }

    //mapeamento
    By continuarButton = By.id("btn-continue");
    By nomePagina = By.className("page-title");
    public By produtoCarrinho(String nomeProduto){ return By.xpath("//a[@class='link-default clearfix'][contains(text(),'"+nomeProduto+"')]");}

    //Ação

    public CarrinhoPage clicarContinuar(){click(continuarButton); return this;}
    public String retornaNomePage(){return getText(nomePagina);}
    public CarrinhoPage validaNomeDaPagina(){Assert.assertEquals("Meu carrinho",retornaNomePage()); return this;}
    public CarrinhoPage VerificaSeContemItemCarrinho(String nomeItem){ waitForElement(By.className("basket-product"));getText(produtoCarrinho(nomeItem)); return this;}


}
