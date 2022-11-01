package com.despegar.interactions;

import com.despegar.userinterfaces.MainPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

public class InsertDateRange implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MainPage.INP_INIT_DATE),
                Click.on(MainPage.INP_INIT_DAY),
                Click.on(MainPage.INP_END_DAY)
        );
    }

    public static InsertDateRange into(){return new InsertDateRange();}
}
