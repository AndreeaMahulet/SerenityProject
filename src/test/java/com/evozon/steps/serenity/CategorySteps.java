package com.evozon.steps.serenity;

import com.evozon.pages.CategoryPage;
import net.thucydides.core.annotations.Step;

public class CategorySteps {

    private CategoryPage categoryPage;

    @Step
    public void clickOnProduct(String name){
        categoryPage.clickOnProduct(name);
    }
}
