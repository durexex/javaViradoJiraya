package com.br.durex.maratonaJava.core.comportamento.dominio;

public class Car {

    private String name = "Audi";
    private String color;
    private String year;

    public String getName() {
        return name;
    }

    public Car(String color, String year) {
        this.color = color;
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public String getYear() {
        return year;
    }
}
