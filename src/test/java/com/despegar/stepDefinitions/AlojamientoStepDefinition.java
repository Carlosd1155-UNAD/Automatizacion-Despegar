package com.despegar.stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class AlojamientoStepDefinition {
    Actor user = Actor.named("The user");

    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void config() {
        user.can(BrowseTheWeb.with(driver));
    }

    @Given("^The user start the navigator$")
    public void theUserStartTheNavigator() {
        user.wasAbleTo(Open.url("https://www.despegar.com.co/"));
    }

    @Given("^a$")
    public void a() {

    }

    @When("^b$")
    public void b() {

    }

    @Then("^c$")
    public void c() {

    }
}
