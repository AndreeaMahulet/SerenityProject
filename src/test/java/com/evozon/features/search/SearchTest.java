package com.evozon.features.search;

import com.evozon.steps.serenity.Searchsteps;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

public class SearchTest extends BaseTest{

    @Steps
    private Searchsteps searchsteps;

    @Test
    public void checkProduct(){
        searchsteps.verifyProductExists("Tori tank");
    }
}
