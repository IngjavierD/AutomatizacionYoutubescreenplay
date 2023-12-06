package com.Youtube.Interactions;

import com.Youtube.Task.BuscarCanciontask;
import com.Youtube.Task.PaginaPrincipaltask;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.List;
import java.util.Random;

import static com.Youtube.UI.SeleccionarCancionUI.LBL_Canciones;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarCancion implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> ListaCanciones = LBL_Canciones.resolveAllFor(actor);
        for (int i=0;i<ListaCanciones.size();i++){
            System.out.println(i+" : "+ListaCanciones.get(i).getText());
        }
        // Eliminar elementos que no contienen la subcadena (ignorando mayúsculas y minúsculas)
        ListaCanciones.removeIf(elemento -> !elemento.getText().toLowerCase().contains(BuscarCanciontask.getNombrecancionbuscar().toLowerCase()));
        for (int i=0;i<ListaCanciones.size();i++){
            System.out.println(i+" : "+ListaCanciones.get(i).getText());
        }
        Random random = new Random();
        int indexrandon = random.nextInt(ListaCanciones.size());

        // Toma el nombre de la canción aleatoria
        String NombreCancion = ListaCanciones.get(indexrandon).getText(); // Cambia el índice si es necesario
        actor.remember("NombreCancionlista", NombreCancion);
        System.out.println("NombreCancionlista: " + NombreCancion);

        ListaCanciones.get(indexrandon).click();
    }

    public static Performable click(){
        return instrumented(SeleccionarCancion.class);
    }
}