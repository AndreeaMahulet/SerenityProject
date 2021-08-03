package com.evozon.features.search;

import com.evozon.steps.serenity.NewProductsSteps;
import com.evozon.steps.serenity.ProductSteps;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

public class NewProductsTest extends BaseTest{
    @Steps
    private NewProductsSteps newProductsSteps;
    @Steps
    private ProductSteps productSteps;
    @Test
    public void clickOnNewProduct(){
        newProductsSteps.clickOnNewProduct("iphone 12");
        productSteps.verifyProductTitle("iphone 12");
    }
}
