package tests;

import base.PageBase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import suport.Web;

public class ComprasSubmarino extends PageBase {
    public ComprasSubmarino(WebDriver driver) {
        super(driver);
    }

    HomePage homePage;
    
    
    @Before
    public void setUp(){
        driver = Web.creatorChrome();

    }

    @Test
    public void colocarItensCarrinhoTest(){}

    //pesquisa não retorna itens "computador zup"
    //colocar itens no carrinho atraves sub-menus
    //Pesquisa produto e envia pro carrinho
    //Pesquisa produto que não encontra
    //Seleciona menu inicial e escolhe produto com preço que quero
    //Tirar item duplicado do carrinho


    @After
    public void tearDown(){
        driver.quit();
    }


}
