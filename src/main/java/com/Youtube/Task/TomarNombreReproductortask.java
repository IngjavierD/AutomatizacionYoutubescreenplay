package com.Youtube.Task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static com.Youtube.UI.ReproductorUI.LBL_NombreCancion;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class TomarNombreReproductortask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        String NombreCancion=LBL_NombreCancion.resolveFor(actor).getText();
        actor.remember("NombreCancionReproductor", NombreCancion);
        System.out.println("Reproductor: "+NombreCancion);
    }

    public static TomarNombreReproductortask on(){
        return instrumented(TomarNombreReproductortask.class);
    }
}
