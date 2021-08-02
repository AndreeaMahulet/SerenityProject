package com.evozon.steps.serenity;

import com.evozon.pages.AccountInformationPage;
import com.evozon.pages.AddressBookPage;
import com.evozon.pages.HomePage;
import com.evozon.util.Constants;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class AddressBookSteps {
    private HomePage homePage;
    @Steps
    private LoginSteps loginSteps;
    private AccountInformationPage accountInformationPage;
    private AddressBookPage addressBookPage;
    @Step
    public void navigateToLoginPage(){
        homePage.open();
        homePage.clickMyAccount();
        homePage.clickLogInLink();
        loginSteps.loginWithCredentials(Constants.USER_EMAIL, Constants.USER_PASS);
        addressBookPage.clickOnAddressBookLink();
    }
    @Step
    public void verifyAddNewAddressText(){
        Assert.assertTrue(addressBookPage.isAddressBookMessage());
    }
    @Step
    public void addNewAddress(){
        addressBookPage.clickOnAddNewAddressButton();
        addressBookPage.setTelephoneField("0729932182");
        addressBookPage.setStreetAddressField("Str. Croitorilor");
        addressBookPage.setCityField("Cluj-Napoca");
        addressBookPage.setCountryDropDown("Romania");
        addressBookPage.setStateDropDown("Cluj");
        addressBookPage.setPostalCodeField("500000");
        addressBookPage.clickOnBillingAddressCheckBox();
        addressBookPage.clickOnShippingAddressCheckBox();
        addressBookPage.clickOnSaveAddressButton();
    }
    @Step
    public void verifySavedNewAddress(){
        Assert.assertTrue(addressBookPage.isSavedAddressMessage());
    }
}
