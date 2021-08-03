package com.evozon.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;

public class ShoppingcartPage extends BasePage{

    public boolean isProductInShoppingcart(String name){
        List<WebElementFacade> elementsFromCart = findAll(By.cssSelector(".cart-table tbody tr"));
        for(WebElementFacade elem: elementsFromCart){
            System.out.println(elem.findElement(By.cssSelector("h2 a")).getText());
            if(elem.findElement(By.cssSelector("h2 a")).getText().equalsIgnoreCase(name)){
                return true;
            }
        }
        return false;
    }
}
