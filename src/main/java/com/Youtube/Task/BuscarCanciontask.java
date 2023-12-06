package com.Youtube.Task;

import com.Youtube.Utils.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.Keys;

import static com.Youtube.UI.PaginaPrincipalUI.TXT_SEARCH;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuscarCanciontask implements Task {

    private static String Nombrecancionbuscar=Data.extractTo().get(0).get("Palabra");
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(Nombrecancionbuscar).into(TXT_SEARCH).thenHit(Keys.ENTER)
        );
    }
    public static String getNombrecancionbuscar() {
        return Nombrecancionbuscar;
    }

    public static BuscarCanciontask on(){
        return instrumented(BuscarCanciontask.class);
    }
}
