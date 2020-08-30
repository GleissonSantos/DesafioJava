package tests;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import suport.Web;

public class ComprasSubmarino {
   private WebDriver driver;

    @Before
    public void setUp(){ driver =  Web.creatorChrome(); }


   // @Test
    public void colocarItensCarrinhoTest(){
        new HomePage(driver)
        .clicarAceitarCookies()
        .clicarNaBarraPesquisa()
        .preencherCampo("Console ps4")
        .clicarEmBuscar()
        .validandoRetornodaBusca()
        .clicarNoProdutoDaLista("Console Sony Playstation 4 Slim Megapack Bundle V11")
        .clicarComprarButton()
        .validaNomeDaPagina()
        .VerificaSeContemItemCarrinho("Console Sony Playstation 4 Slim Megapack Bundle V11");

    }

   // @Test
    public void pesquisarItemInexistente(){
        String validarItem = new HomePage(driver)
                .clicarAceitarCookies()
                .clicarNaBarraPesquisa()
                .preencherCampo("desafiozup")
                .clicarEmBuscar()
                .retornaTextoProdutoInexistente();
        assertEquals("Não encontramos nenhum resultado na sua busca.",validarItem);
    }

    @Test
    public void ComprarCelularPorMarcaUtilizandoSubMenueMenuLateral(){
        new HomePage(driver)
        .clicarAceitarCookies()
        .clicarSmartPhone()
        .clicarMenuLateral()
//        .clicaNaCategoriaDoTelefoneDesejado("iPhone")
        .clicarNoModeloDesejado()
        .clicarNoModeloEspecifico("Iphone 11 Pro Max")
        .clicarNoSmartPhoneDaLista("iPhone 11 Pro Max 512GB Cinza Espacial iOS 4G + Wi-Fi Câmera 12MP")
        .clicarComprarButton()
        .validaNomeDaPagina()
        .VerificaSeContemItemCarrinho("iPhone 11 Pro Max 512GB Cinza Espacial iOS 4G + Wi-Fi Câmera 12MP");
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    //colocar itens no carrinho atraves sub-menus
    //Pesquisa produto e envia pro carrinho
    //Pesquisa produto que não encontra
    //Seleciona menu inicial e escolhe produto com preço que quero
    //Tirar item duplicado do carrinho

}
