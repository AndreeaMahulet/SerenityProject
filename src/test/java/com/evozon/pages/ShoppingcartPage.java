package com.evozon.pages;

import com.evozon.util.Constants;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;

public class ShoppingcartPage extends BasePage{

    @FindBy(css=".messages span")
    private WebElementFacade wasAddedMessage;

    @FindBy(css=".product-cart-price .price")
    private WebElementFacade price;

    @FindBy(css="input[title='Qty']")
    private WebElementFacade qty;

    @FindBy(css=".product-cart-total .cart-price")
    private WebElementFacade subtotal;


    public boolean isProductAdded(String productName){
        return wasAddedMessage.getText().equalsIgnoreCase(productName + Constants.productWasAddedMessage);
    }

    public WebElementFacade getAProductFromShoppingcart(String name){
        List<WebElementFacade> elementsFromCart = findAll(By.cssSelector(".cart-table tbody tr"));
        for(WebElementFacade product: elementsFromCart){
            if(product.findElement(By.cssSelector("h2 a")).getText().equalsIgnoreCase(name)){
                return product;
            }
        }
        return null;
    }

    public boolean isProductInShoppingcart(String name){

        WebElementFacade product = getAProductFromShoppingcart(name);
        if(product!=null){
            return true;
        }else {
            return false;
        }
    }

//    @FindBy(css= "a[class*='btn-remove']")
//    private WebElementFacade deleteBtn;


    public void removeProductFromShoppingcart(String productName){

        WebElementFacade product = getAProductFromShoppingcart(productName);
        if(product!=null){
            clickOn(product.findElement(By.cssSelector("td[class*=\"cart-remove\"]")));
        }
    }

    public void changeQuantity(String numberText){
        typeInto(qty,numberText);
    }

    public String getPrice(){
        return price.getValue();
    }

    public String getTotalPrice(){
        return subtotal.getValue();
    }



}
