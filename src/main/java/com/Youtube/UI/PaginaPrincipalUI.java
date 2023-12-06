package com.Youtube.UI;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaPrincipalUI {
    public static Target TXT_SEARCH=Target.the("Input search").
            located(By.xpath("//input[@id=\"search\"]"));
}
