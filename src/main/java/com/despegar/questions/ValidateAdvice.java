package com.despegar.questions;

import com.despegar.userinterfaces.MainPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateAdvice implements Question <String>{

    @Override
    public String answeredBy(Actor actor) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return Text.of(MainPage.STR_ADVICE).viewedBy(actor).asString();
    }

    public static ValidateAdvice showedAs() {return new ValidateAdvice();}
}
