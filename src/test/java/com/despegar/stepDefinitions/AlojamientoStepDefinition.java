package com.despegar.stepDefinitions;

import com.despegar.interactions.GoToAlojamientos;
import com.despegar.interactions.InsertDateRange;
import com.despegar.questions.ValidateAdvice;
import com.despegar.tasks.SelectHotels;
import com.despegar.tasks.TypeInto;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

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

    @Given("^the user is looking for hotels$")
    public void theUserIsLookingForHotels() {
        user.attemptsTo(GoToAlojamientos.now());
    }

    @When("^he type \"([^\"]*)\" into destination$")
    public void heTypeIntoDestination(String destination) {
        user.attemptsTo(TypeInto.destination(destination));
    }

    @Then("^he can see an advice \"([^\"]*)\" \"([^\"]*)\"$")
    public void heCanSeeAnAdvice(String advice, String destination) {
//        System.out.println("Method: "+ValidateAdvice.showedAs().answeredBy(user));
//        System.out.println(advice+destination);
        user.should(seeThat(ValidateAdvice.showedAs(), Matchers.is(advice+destination)));
    }

    @When("^he select a date range greater than a week$")
    public void heSelectADateRangeGreaterThanAWeek() {
        user.attemptsTo(InsertDateRange.into());
    }

    @Then("^he can see that it is inserted correctly$")
    public void heCanSeeThatItIsInsertedCorrectly() {

    }

    @Given("^the user add a room$")
    public void theUserAddARoom() {

    }

    @When("^he adds two rooms more and then he remove three$")
    public void heAddsTwoRoomsMoreAndThenHeRemoveThree() {

    }

    @Then("^he can see only one room$")
    public void heCanSeeOnlyOneRoom() {

    }

    @Given("^the user selects room section$")
    public void theUserSelectsRoomSection() {

    }

    @When("^he adds seven more people$")
    public void heAddsSevenMorePeople() {

    }

    @Then("^he can see the child selector is deactivated$")
    public void heCanSeeTheChildSelectorIsDeactivated() {

    }

    @When("^he forget insert into destination field and do click in search button$")
    public void heForgetInsertIntoDestinationFieldAndDoClickInSearchButton() {

    }

    @Then("^he can see an advice showing the message \"([^\"]*)\"$")
    public void heCanSeeAnAdviceShowingTheMessage(String arg1) {

    }

    @When("^he is looking for a hotel in \"([^\"]*)\"$")
    public void heIsLookingForAHotelIn(String arg1) {

    }

    @Then("^he can see \"([^\"]*)\" results appear per page$")
    public void heCanSeeResultsAppearPerPage(String arg1) {

    }
}
