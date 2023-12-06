package com.Youtube.Task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.Keys;

import javax.swing.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.Youtube.UI.PaginaPrincipalUI.TXT_SEARCH;
public class PaginaPrincipaltask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url("https://www.youtube.com/")
        );
    }

    public static PaginaPrincipaltask on(){
        return instrumented(PaginaPrincipaltask.class);
    }

}