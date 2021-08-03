package com.evozon.features.search;

import com.evozon.steps.serenity.AccountInformationSteps;
import com.evozon.steps.serenity.AddressBookSteps;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

public class AddressBookTest extends BaseTest{
    @Steps
    private AddressBookSteps addressBookSteps;
    @Test
    public void addNewAddress(){
        addressBookSteps.navigateToLoginPage();
        addressBookSteps.verifyAddNewAddressText();
        addressBookSteps.addNewAddress();
        addressBookSteps.verifySavedNewAddress();
        addressBookSteps.clickOnBillingAddressEdit();
        addressBookSteps.verifySavedAddressInAddressBook();
    }
}
