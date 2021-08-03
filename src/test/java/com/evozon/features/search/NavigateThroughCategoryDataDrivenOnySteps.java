package com.evozon.features.search;

import com.evozon.steps.serenity.CategorySteps;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import net.thucydides.junit.runners.ThucydidesRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static net.thucydides.core.steps.stepdata.StepData.withTestDataFrom;

@RunWith(ThucydidesRunner.class)
public class NavigateThroughCategoryDataDrivenOnySteps extends BaseTest{
    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private CategorySteps categorySteps;

    private String category;

    @Test
    public void navigateToCategoryOnlySteps() throws IOException {
        //categorySteps.navigate(category);
        //withTestDataFrom("src/test/resources/csv/csvFile.csv").run(categorySteps).navigateToCategoryAndVerifyTitle();
        withTestDataFrom("src/test/resources/csv/csv2File.csv").run(categorySteps).navigateToSubcategoryAndVerifyTitle();
    }

}
