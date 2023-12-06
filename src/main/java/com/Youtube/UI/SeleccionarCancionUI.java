package com.Youtube.UI;

import net.serenitybdd.screenplay.targets.Target;

public class SeleccionarCancionUI {
    public static Target LBL_Canciones=Target.the("Lista de Canciones").
            locatedBy("//a[@id='video-title']");
}
