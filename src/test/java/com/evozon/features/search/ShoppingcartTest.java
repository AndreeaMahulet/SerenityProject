package com.evozon.features.search;

import com.evozon.steps.serenity.CategorySteps;
import com.evozon.steps.serenity.ProductSteps;
import com.evozon.steps.serenity.ShoppingcartSteps;
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
    public void shoppingCartTest(){
        shoppingcartSteps.navigateToSubCategory("women","new arrivals");
        categorySteps.clickOnProduct("tori tank");
        productSteps.setProductDetailsAndAddToCart("Indigo","M");
        shoppingcartSteps.verifyMessageAppears("Tori Tank");
        shoppingcartSteps.verifyThatProductIsInCart("tori tank");
        //shoppingcartSteps.changeQuantityAnVerifyTotal("3");
        //shoppingcartSteps.removeProduct("tori tank");
        shoppingcartSteps.verifyProductIsRemoved("tori tank");
    }

//    @Test
//    public void addProduct(){
//        shoppingcartSteps.navigateToSubCategory("women","new arrivals");
//        categorySteps.clickOnProduct("tori tank");
//        productSteps.setProductDetailsAndAddToCart("Indigo","M");
//    }
//
//    @Test
//    public void addtocartwithoutloginTest(){
////        shoppingcartSteps.addToShoppingcartWithoutBeingLoggedIn();
//        shoppingcartSteps.navigateToSubCategory("women","new arrivals");
//        categorySteps.clickOnProduct("tori tank");
//        productSteps.setProductDetailsAndAddToCart("Indigo","M");
//        shoppingcartSteps.verifyMessageAppears("Tori Tank");
//        shoppingcartSteps.verifyThatProductIsInCart("tori tank");
//    }
//
//
//    @Test
//    public void removeProductFromShoppingcartTest(){
//        addtocartwithoutloginTest();
//        shoppingcartSteps.verifyProductIsRemoved("tori tank");
//    }
//
//    @Test
//    public void qytChangesTest(){
//        addProduct();
//        shoppingcartSteps.verifyQtyChanges("3");
//    }
}
