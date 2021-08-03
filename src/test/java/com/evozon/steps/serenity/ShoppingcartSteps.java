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
    public void verifyThatProductIsInCart(String productName){
        Assert.assertTrue(shoppingcartPage.isProductInShoppingcart(productName));
    }

}
