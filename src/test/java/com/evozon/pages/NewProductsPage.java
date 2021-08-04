package com.evozon.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class NewProductsPage extends BasePage{

    @FindBy(css=".widget-products ul .item a")
    List<WebElementFacade> newProductsList;
    public void clickOnProduct(String productName){
        for(WebElementFacade products:newProductsList){
            if(products.getTextValue().equalsIgnoreCase(productName)){
                System.out.println(products.getText());
                clickOn(products);
                break;
            }
        }
    }
}
