package com.evozon.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;

public class SearchPage extends BasePage{
    @FindBy(css="#search")
    private WebElementFacade searchField;

    @FindBy(css="button[class*=\"search-button\"]")
    private WebElementFacade searchBtn;

    public void setSearchField(String productName){
        typeInto(searchField,productName);
    }

    public void clickOnSearchBtn() {
        clickOn(searchBtn);
    }

    public boolean isProductFound(String productName){
        List<WebElementFacade> productsReturned = findAll(By.cssSelector("ul[class*=\"products-grid\"] li[class=\"item last\"]"));
        for(WebElementFacade product:productsReturned){
            if(product.findElement(By.cssSelector(".product-name")).getText().equalsIgnoreCase(productName)){
                return true;
            }
        }
        return false;
    }


}
