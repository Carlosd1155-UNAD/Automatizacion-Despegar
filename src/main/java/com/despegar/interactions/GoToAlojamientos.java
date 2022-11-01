package com.despegar.interactions;

import com.despegar.tasks.SelectAlojamientos;
import com.despegar.tasks.SelectHotels;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class GoToAlojamientos implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SelectAlojamientos.button(), SelectHotels.button());
    }

    public static GoToAlojamientos now() {return new GoToAlojamientos();}
}
