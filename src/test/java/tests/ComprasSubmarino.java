package tests;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import suport.ResourceParameters;
import suport.Web;

public class ComprasSubmarino {
   private WebDriver driver;

    @Before
    public void setUp(){ driver =  Web.creatorChrome(); }


    @Test
    //Busca o item através da barra pesquisa, seleciona e segue com o processo de compra
    public void colocarItensCarrinhoTest(){
        new HomePage(driver)

        .clicarAceitarCookies()
        .clicarNaBarraPesquisa()
        .preencherCampo(ResourceParameters.produtoASerBuscado)
        .clicarEmBuscar()
        .validandoRetornodaBusca()
        .clicarNoProdutoDaLista(ResourceParameters.modeloConsole)
        .clicarComprarButton()
        .validaNomeDaPagina()
        .VerificaSeContemItemCarrinho(ResourceParameters.modeloConsole);
    }

    @Test
    //Busca por um item que não existe
    public void pesquisarItemInexistente(){
        String validarItem = new HomePage(driver)

        .clicarAceitarCookies()
        .clicarNaBarraPesquisa()
        .preencherCampo(ResourceParameters.produtoInexistenteASerBuscado)
        .clicarEmBuscar()
        .retornaTextoProdutoInexistente();
        assertEquals("Não encontramos nenhum resultado na sua busca.",validarItem);
    }

    @Test
    //Busca um item e vai navegando na página através dos submenus até encontrar o smartphome desejado,no caso um Iphone
    public void comprarCelularPorMarcaUtilizandoSubMenuEMenuLateral(){
         new HomePage(driver)

        .clicarAceitarCookies()
        .clicarSmartPhone()
        .clicarCategoriaSmarPhoneMenuLateral()
        .clicarNoModeloDesejado()
        .clicarNoModeloEspecifico(ResourceParameters.modeloEspecificoSmartPhone)
        .clicarNoSmartPhoneDaLista(ResourceParameters.nomeCompletoModeloSmartPhone)
        .clicarComprarButton()
        .validaNomeDaPagina()
        .VerificaSeContemItemCarrinho(ResourceParameters.nomeCompletoModeloSmartPhone);
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
