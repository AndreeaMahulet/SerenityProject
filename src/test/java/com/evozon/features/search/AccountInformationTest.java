package com.evozon.features.search;

import com.evozon.pages.AccountInformationPage;
import com.evozon.pages.DashboardPage;
import com.evozon.steps.serenity.AccountInformationSteps;
import com.evozon.util.Constants;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

public class AccountInformationTest extends BaseTest{
    @Steps
    private AccountInformationSteps accountInformationSteps;

    @Test
    public void goToEditAccount(){
        accountInformationSteps.navigateToLoginPage();
        accountInformationSteps.verifyAccountInformationText();
        accountInformationSteps.editAccountInformation("Andreea","Mahu");
        accountInformationSteps.verifyEditedAccount(Constants.NEW_USERNAME);
    }


}
