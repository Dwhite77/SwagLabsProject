package com.sparta.grp1.cucumber.stepdefs;

import com.sparta.grp1.pom.fragements.NavigationBarPOM;
import com.sparta.grp1.pom.pages.LoginPOM;
import com.sparta.grp1.pom.pages.LogoutPOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class NavigationBarStepDef {

    private StepDefStateManager stepDefStateManager;
    private static NavigationBarPOM navigationBarPOM;
    private static LogoutPOM logoutPOM;
    private static LoginPOM loginPOM;

    public NavigationBarStepDef (StepDefStateManager stepDefStateManager) {
        this.stepDefStateManager = stepDefStateManager;
    }

    @Given("I have opened the nav bar")
    public void iHaveOpenedTheNavBar() {
        navigationBarPOM = new NavigationBarPOM(stepDefStateManager.getWebDriver());
        logoutPOM = new LogoutPOM(stepDefStateManager.getWebDriver());
        loginPOM = new LoginPOM(stepDefStateManager.getWebDriver());
        navigationBarPOM.openingNavBar();

    }

    @When("I click on the all items button")
    public void iClickOnTheAllItemsButton() {
        navigationBarPOM.openingAllItemsPage();
    }

    @Then("I will go to the all items page")
    public void iWillGoToTheAllItemsPage() {
        navigationBarPOM.checkIamOnAllItemsPage();
    }

    @When(": I click on the about button")
    public void iClickOnTheAboutButton() {
        navigationBarPOM.openingAboutPage();
    }

    @Then(": I will go to the about page")
    public void iWillGoToTheAboutPage() {
        navigationBarPOM.checkIamOnAboutPage();
    }
}
