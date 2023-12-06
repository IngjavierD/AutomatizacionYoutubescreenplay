package com.Youtube.stepdefinitions;

import com.Youtube.Questions.ValidacionCancionQuestions;
import com.Youtube.Task.PaginaPrincipaltask;
import com.Youtube.Task.SeleccionarCanciontask;
import com.Youtube.Task.TomarNombreReproductortask;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ReproducirYoutubeStepDefinitions {


    @Before
    public void setupActor() {
        setTheStage(new OnlineCast());
    }
    @Dado("que el usuario abre el navegador")
    public void queElUsuarioAbreElNavegador() {
        theActorCalled("user").wasAbleTo(
                PaginaPrincipaltask.on()
        );
    }
    @Cuando("busca y selecciona aleatoriamente una canción en YouTube")
    public void buscaYSeleccionaAleatoriamenteUnaCanciónEnYouTube() {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarCanciontask.on(),
                TomarNombreReproductortask.on()
        );
    }
    @Entonces("el usuario debería poder ver la reproducción de la canción")
    public void elUsuarioDeberíaPoderVerLaReproducciónDeLaCanción() {
    theActorInTheSpotlight().should(
            seeThat(
                    ValidacionCancionQuestions.from(),
                    Matchers.equalTo(true)
            )
    );
    }
}
