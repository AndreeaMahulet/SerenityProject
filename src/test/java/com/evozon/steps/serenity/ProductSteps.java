package com.evozon.steps.serenity;

import com.evozon.pages.ProductPage;
import net.thucydides.core.annotations.Step;

public class ProductSteps {

    private ProductPage productPage;

    @Step
    public void setProductDetailsAndAddToCart(String color, String size){
        productPage.selectColor(color);
        productPage.selectSize(size);
        productPage.clickOnAddToCart();
    }
}
