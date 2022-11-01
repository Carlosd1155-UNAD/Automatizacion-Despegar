package com.despegar.tasks;

import com.despegar.userinterfaces.MainPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectHotels implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MainPage.BTN_HOTELS)
        );
    }

    public static SelectHotels button() {return Tasks.instrumented(SelectHotels.class);}
}
