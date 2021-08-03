package com.evozon.steps.serenity;

import com.evozon.pages.NewProductsPage;
import net.thucydides.core.annotations.Step;

public class NewProductsSteps {
    private NewProductsPage newProductsPage;
    @Step
    public void clickOnNewProduct(String name){
        newProductsPage.clickOnProduct(name);
    }

}
