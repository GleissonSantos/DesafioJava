package tests;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import suport.Web;

public class ComprasSubmarino {
   private WebDriver driver;

    @Before
    public void setUp(){ driver =  Web.creatorChrome(); }


    @Test
    public void colocarItensCarrinhoTest(){
        String produtoASerBuscado = "Console ps4";
        String modeloConsole = "Console Sony Playstation 4 Slim Megapack Bundle V11";
        new HomePage(driver)

        .clicarAceitarCookies()
        .clicarNaBarraPesquisa()
        .preencherCampo(produtoASerBuscado)
        .clicarEmBuscar()
        .validandoRetornodaBusca()
        .clicarNoProdutoDaLista(modeloConsole)
        .clicarComprarButton()
        .validaNomeDaPagina()
        .VerificaSeContemItemCarrinho(modeloConsole);
    }

    @Test
    public void pesquisarItemInexistente(){
        String produtoASerBuscado = "desafiozup";
        String validarItem = new HomePage(driver)

        .clicarAceitarCookies()
        .clicarNaBarraPesquisa()
        .preencherCampo(produtoASerBuscado)
        .clicarEmBuscar()
        .retornaTextoProdutoInexistente();
        assertEquals("Não encontramos nenhum resultado na sua busca.",validarItem);
    }

    @Test
    public void comprarCelularPorMarcaUtilizandoSubMenuEMenuLateral(){
         String marcaSmartPhone = "Iphone 11 Pro Max";
         String modeloSmartPhone = "iPhone 11 Pro Max 512GB Cinza Espacial iOS 4G + Wi-Fi Câmera 12MP";
         new HomePage(driver)

        .clicarAceitarCookies()
        .clicarSmartPhone()
        .clicarCategoriaSmarPhoneMenuLateral()
        .clicarNoModeloDesejado()
        .clicarNoModeloEspecifico(marcaSmartPhone)
        .clicarNoSmartPhoneDaLista(modeloSmartPhone)
        .clicarComprarButton()
        .validaNomeDaPagina()
        .VerificaSeContemItemCarrinho(modeloSmartPhone);
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
