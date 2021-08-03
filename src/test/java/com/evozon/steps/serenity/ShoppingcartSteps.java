package com.evozon.steps.serenity;

import com.evozon.pages.CategoryPage;
import com.evozon.pages.ShoppingcartPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class ShoppingcartSteps {

    private CategoryPage categoryPage;
    private ShoppingcartPage shoppingcartPage;


    @Step
    public void navigateToSubCategory(String categoryName, String subcategoryName){
        categoryPage.navigateToCategory(categoryName);
        categoryPage.navigateToSubcategory(subcategoryName);
    }

    @Step
    public void verifyMessageAppears(String productName){
        Assert.assertTrue(shoppingcartPage.isProductAdded(productName));
    }

    @Step
    public void verifyThatProductIsInCart(String productName){
        Assert.assertTrue(shoppingcartPage.isProductInShoppingcart(productName));
    }

    @Step
    public void removeProduct(String productName){
        shoppingcartPage.removeProductFromShoppingcart(productName);
    }

    @Step
    public void verifyProductIsRemoved(String productName){
        Assert.assertFalse(shoppingcartPage.isProductInShoppingcart(productName));
    }

    @Step
    public void changeQuantityAnVerifyTotal(String numberText){

        String price = shoppingcartPage.getPrice();
        int priceInt = Integer.parseInt(price);

        shoppingcartPage.changeQuantity(numberText);
        int number = Integer.parseInt(numberText);

        String totalPriceDisplayed = shoppingcartPage.getTotalPrice();
        int totalPrice = Integer.parseInt(totalPriceDisplayed);

        System.out.println(number*priceInt);
        System.out.println(totalPrice);

        Assert.assertEquals(number*priceInt,totalPrice);
    }



}
