package com.evozon.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class NewProductsPage extends BasePage{

    public void clickOnProduct(String productName){
        List<WebElementFacade> newProductsList = findAll(".widget-products ul .item a ");
        System.out.println(newProductsList);
        for(WebElementFacade products:newProductsList){
            if(products.getTextValue().equalsIgnoreCase(productName)){
                System.out.println(products.getText());
                clickOn(products);
                break;
            }
        }
    }
}
