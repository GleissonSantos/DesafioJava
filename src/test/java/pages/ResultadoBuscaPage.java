package pages;

import base.PageBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultadoBuscaPage extends PageBase {
    public ResultadoBuscaPage(WebDriver driver) {
        super(driver);
    }

    //mapeamento
    By resultadoBusca = By.xpath("//div[@class='form-group display-sm-inline-block']");
    public By produto(String nomeCompletoproduto){ return By.xpath("//h2[contains(text(), '"+ nomeCompletoproduto +"')]");}
    By mensagemProdutoInexistente = By.xpath("//span[@class='TextUI-sc-12tokcy-0 CIZtP']");

    //Ações

    public String retornaQtdProdutos(){ return getText(resultadoBusca); }
    public String retornaTextoProdutoInexistente(){ return getText(mensagemProdutoInexistente); }
    public ResultadoBuscaPage validandoRetornodaBusca(){ Assert.assertNotEquals("0",retornaQtdProdutos()); return this;}
    public ProdutoPage clicarNoProdutoDaLista(String nomeProduto){ click(produto(nomeProduto)); return new ProdutoPage(driver);}

    }

