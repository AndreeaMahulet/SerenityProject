package com.evozon.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class ProductPage extends BasePage{

    @FindBy(css = ".add-to-cart-buttons button")
    private WebElementFacade addCartBtn;

    public void selectColor(String color){
        getDriver().findElement(By.cssSelector("#configurable_swatch_color a[title='"+color+"']")).click();
    }

    public void selectSize(String size){
        getDriver().findElement(By.cssSelector("#configurable_swatch_size a[title='"+size+"'")).click();
    }

    public void clickOnAddToCart(){
        clickOn(addCartBtn);
    }
}
