package com.Youtube.Task;

import com.Youtube.Interactions.SeleccionarCancion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarCanciontask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SeleccionarCancion.click()
        );
    }
    public static SeleccionarCanciontask on(){
        return instrumented(SeleccionarCanciontask.class);
}
}
