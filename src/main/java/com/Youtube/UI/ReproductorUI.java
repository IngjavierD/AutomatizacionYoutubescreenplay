package com.Youtube.UI;

import net.serenitybdd.screenplay.targets.Target;

public class ReproductorUI {
    public static Target LBL_NombreCancion=Target.the("Lista de Canciones").
            locatedBy("//h1[@class='style-scope ytd-watch-metadata']");
}
