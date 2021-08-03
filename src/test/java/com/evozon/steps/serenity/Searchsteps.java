package com.evozon.steps.serenity;

import com.evozon.pages.SearchPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.yecht.Data;

public class Searchsteps {

    private SearchPage searchPage;
    private String searchKeyword, searchResult;
    @Step
    public void searchAndVerify(){
       searchProduct(searchKeyword);
       verifyProductExists(searchResult);
    }

    @Step
    public void searchProduct(String productName){
        searchPage.setSearchField(productName);
        searchPage.clickOnSearchBtn();
    }
    @Step
    public void verifyProductExists(String productName){
        Assert.assertTrue(searchPage.isProductFound(productName));
    }

}
