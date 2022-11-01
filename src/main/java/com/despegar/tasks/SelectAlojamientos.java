package com.despegar.tasks;

import com.despegar.userinterfaces.MainPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectAlojamientos implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MainPage.BTN_ALOJAMIENTOS)
        );
    }

    public static SelectAlojamientos button() {return Tasks.instrumented(SelectAlojamientos.class);}
}
