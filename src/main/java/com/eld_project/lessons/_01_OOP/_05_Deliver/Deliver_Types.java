package com.eld_project.lessons._01_OOP._05_Deliver;

public enum Deliver_Types {

    STEP ("Пешая доставка 200 сом."),
    AUTO ("Авто доставка 500 сом."),
    AIR("Авиа доставка 1000 сом."),
    SEA ("Доставка по воде 3000 сом.");

    private String value;

    Deliver_Types(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
