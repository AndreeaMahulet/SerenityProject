package com.evozon.steps.serenity;

import com.evozon.pages.CategoryPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import org.junit.Assert;

public class CategorySteps {

    private CategoryPage categoryPage;

    private String category,subcategory;

    @Step
    public void clickOnProduct(String name){
        categoryPage.clickOnProduct(name);
    }

    @Step
    public void navigateToCategoryAndVerifyTitle(){
        navigate(category);
        verifyCurrentCategory(category);
    }
@Step
public void navigateToSubcategory(String subcategoryTitle){
        categoryPage.navigateToSubcategory(subcategoryTitle);
}
    @Step
    public void navigateToSubcategoryAndVerifyTitle(){
        navigate(category);
        verifyCurrentCategory(category);
navigateToSubcategory(subcategory);
        verifyCurrentCategory(subcategory);
    }
    @Step
    public void navigate(String productName){
        categoryPage.navigateToCategory(productName);
    }

    @Step
    public void verifyCurrentCategory(String epectedCategoryTitle){
        Assert.assertTrue(categoryPage.getCategoryTitle().equalsIgnoreCase(epectedCategoryTitle));
    }
}
