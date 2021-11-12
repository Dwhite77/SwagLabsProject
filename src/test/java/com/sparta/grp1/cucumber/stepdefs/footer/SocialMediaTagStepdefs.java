package com.sparta.grp1.cucumber.stepdefs.footer;

import com.sparta.grp1.cucumber.stepdefs.util.StepDefStateManager;
import com.sparta.grp1.pom.fragements.SocialMediaTagsPOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SocialMediaTagStepdefs {
    private StepDefStateManager stepDefStateManager;
    private static SocialMediaTagsPOM socialMediaTagsPOM;

    // PicoContainer injects class StepDefStateManager
    public SocialMediaTagStepdefs (StepDefStateManager stepDefStateManager) {
        this.stepDefStateManager = stepDefStateManager;
    }

    @Given("I am looking at the bottom of a page")
    public void iAmLookingAtTheBottomOfAPage() {
     socialMediaTagsPOM = new SocialMediaTagsPOM(stepDefStateManager.getWebDriver());
    }

    @When("I click on the {string} logo")
    public void iClickOnTheLogo(String arg0) {
        socialMediaTagsPOM.clickOnSocialMediaTag(arg0);
    }

    @Then("I should go to {string}")
    public void iShouldGoTo(String arg0) {
        assertTrue(socialMediaTagsPOM.isSocialMediaPage(arg0));
    }

    @Then("I go back to the products page tab")
    public void iGoBackToTheProductsPageTab() {
        socialMediaTagsPOM.goToOriginalTab();
    }
}
