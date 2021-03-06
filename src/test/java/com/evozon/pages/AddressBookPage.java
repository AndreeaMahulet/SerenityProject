package com.evozon.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class AddressBookPage extends BasePage{
    @FindBy(css="li a[href*=\"/customer/address\"] ")
    private WebElementFacade addressLink;
    @FindBy(css="button[title=\"Add New Address\"]")
    private WebElementFacade addNewAddressButton;
    @FindBy(css="input[name=\"telephone\"]")
    private WebElementFacade telephoneField;
    @FindBy(css="#street_1")
    private WebElementFacade streetAddressField;
    @FindBy(css="input[name=\"city\"]")
    private WebElementFacade cityField;
    @FindBy(css="select[name=\"region_id\"]")
    private WebElementFacade stateDropDown;
    @FindBy(css="input[name=\"postcode\"]")
    private WebElementFacade postalCodeField;
    @FindBy(css="select[name=\"country_id\"]")
    private WebElementFacade countryDropDown;
    @FindBy(name = "default_billing")
    private WebElementFacade billingAddressCheckBox;
    @FindBy(name="default_shipping")
    private WebElementFacade shippingAddressCheckBox;
    @FindBy(css="button[title=\"Save Address\"]")
    private WebElementFacade saveAddressButton;
    @FindBy(className = "success-msg")
    private WebElementFacade savedAddressMessage;
    @FindBy(css=".page-title h1")
    private WebElementFacade addressBookMessage;
    @FindBy(xpath="//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/div[1]/ol/li[1]/p/a")
    private WebElementFacade changeBillingAddressButton;
    @FindBy(css="#telephone")
    private WebElementFacade telephoneFieldWithData;
    @FindBy(xpath="//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/div[1]/ol/li[1]/address/text()[2]")
    private WebElementFacade streetAddress;

    public void clickOnAddNewAddressButton(){
        clickOn(addNewAddressButton);
    }
    public void setTelephoneField(String telephone){
        typeInto(telephoneField,telephone);
    }
    public void setStreetAddressField(String streetAddress){
        typeInto(streetAddressField,streetAddress);
    }
    public void setCityField(String city){
        typeInto(cityField,city);
    }
    public void setStateDropDown(String state){
        stateDropDown.selectByVisibleText(state);
    }
    public void setPostalCodeField(String postalCode){
        typeInto(postalCodeField,postalCode);
    }
    public void setCountryDropDown(String country){
        countryDropDown.selectByVisibleText(country);
    }
    public void clickOnBillingAddressCheckBox(){
        clickOn(billingAddressCheckBox);
    }
    public void clickOnShippingAddressCheckBox(){
        clickOn(shippingAddressCheckBox);
    }
    public void clickOnSaveAddressButton(){
        clickOn(saveAddressButton);
    }
    public boolean isSavedAddressMessage(){
        return savedAddressMessage.containsOnlyText("The address has been saved.");
    }
    public boolean isAddressBookMessage(){
        return addressBookMessage.containsOnlyText("ADDRESS BOOK");
    }
    public void clickOnAddressBookLink(){
        clickOn(addressLink);
    }
    public void clickOnBillingAddressEditLink(){
        clickOn(changeBillingAddressButton);
    }
    public boolean isAddressBookSavedAsBillingAddress(){
        return streetAddress.getText().equalsIgnoreCase(telephoneFieldWithData.getText());
    }
}
