package com.evozon.features.search;

import com.evozon.steps.serenity.Searchsteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static net.thucydides.core.steps.stepdata.StepData.withTestDataFrom;

//@RunWith(SerenityParameterizedRunner.class)
//@UseTestDataFrom(value = "src/test/resources/searchDataDriven.csv")
@RunWith(SerenityRunner.class)

public class SearchDataDrivenTest extends BaseTest{
    @Managed(uniqueSession = true)
    private WebDriver webdriver;
    @Steps
    private Searchsteps searchsteps;
//    private String searchResult,searchKeyword;
    @Test
    public void searchItem() throws IOException {
        withTestDataFrom("src/test/resources/searchDataDriven.csv").run(searchsteps).searchAndVerify();
    }
}
