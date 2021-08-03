package com.evozon.steps.serenity;

import com.evozon.pages.SearchPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class Searchsteps {

    private SearchPage searchPage;

    @Step
    public void verifyProductExists(String productName){
        searchPage.setSearchField(productName);
        searchPage.clickOnSearchBtn();
        Assert.assertTrue(searchPage.isProductFound(productName));
    }

}
