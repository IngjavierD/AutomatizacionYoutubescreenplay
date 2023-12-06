package com.Youtube.Questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionCancionQuestions implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String ProductoLista=actor.recall("NombreCancionlista");
        String Productoreproductor=actor.recall("NombreCancionReproductor");
        return Productoreproductor.equals(ProductoLista);
    }

    public static Question<Boolean> from(){
        return new ValidacionCancionQuestions();
    }
}
