package com.evozon.features.search;

import com.evozon.pages.ProductPage;
import com.evozon.steps.serenity.CategorySteps;
import com.evozon.steps.serenity.ProductSteps;
import com.evozon.steps.serenity.ShoppingcartSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

public class ShoppingcartTest extends BaseTest{
    @Steps
    private ShoppingcartSteps shoppingcartSteps;

    @Steps
    private ProductSteps productSteps;

    @Steps
    private CategorySteps categorySteps;

    @Test
    public void addtocartwithoutloginTest(){
//        shoppingcartSteps.addToShoppingcartWithoutBeingLoggedIn();
        shoppingcartSteps.navigateToSubCategory("women","new arrivals");
        categorySteps.clickOnProduct("tori tank");
        productSteps.setProductDetailsAndAddToCart("Indigo","M");
        shoppingcartSteps.verifyThatProductIsInCart("tori tank");
    }
}
