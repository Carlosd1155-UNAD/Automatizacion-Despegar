package com.despegar.tasks;

import com.despegar.userinterfaces.MainPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class TypeInto implements Task {

    private String term;

    public TypeInto(String term) {
        this.term = term;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(term).into(MainPage.INP_DESTINATION)
        );
    }

    public static TypeInto destination(String term) {return Tasks.instrumented(TypeInto.class, term);}
}
