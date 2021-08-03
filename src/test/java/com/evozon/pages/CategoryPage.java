package com.evozon.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;



import java.util.List;

public class CategoryPage extends BasePage{

public String getCategoryTitle(){
  return  getDriver().findElement(By.cssSelector(".category-title h1")).getText();
}

    public WebElementFacade getCategory(String category){
        List<WebElementFacade> navigationBarElements = findAll("#nav .nav-primary > li");
        for(WebElementFacade nav:navigationBarElements) {
            if (nav.getText().equalsIgnoreCase(category)) {
                return nav;
            }
        }
        return null;
    }

    public void navigateToCategory(String categoryTitle){
        List<WebElementFacade> navigationBarElements = findAll("#nav .nav-primary > li");
        for(WebElementFacade nav:navigationBarElements){
            if(nav.getText().equalsIgnoreCase(categoryTitle)){
                clickOn(nav);
                break;
            }
        }
    }

    public void navigateToSubcategory(String subcategoryTitle){
        List<WebElementFacade> subcategories = findAll(By.cssSelector(".catblocks a span"));
        for (WebElementFacade subcategory : subcategories) {
            System.out.println(subcategory.getText());
            if (subcategory.getText().equalsIgnoreCase(subcategoryTitle)) {
              clickOn(subcategory);
                break;
            }
        }
    }


    public void clickOnProduct(String productName){
        List<WebElementFacade> allProducts = findAll(".products-grid .product-name");
        for(WebElementFacade product:allProducts){
            if(product.getText().equalsIgnoreCase(productName)){
                System.out.println(product.getText());
                product.click();
                break;
            }
        }

    }



}
