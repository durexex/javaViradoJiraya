package com.br.durex.maratonaJava.core.comportamento.test;

import com.br.durex.maratonaJava.core.comportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
//
//    private static List<Car> filteredCars(List<Car> cars) {
//        List<Car> greenCars = new ArrayList<>();
////        for (Car car : cars)
//    }


    public static void main(String[] args) {
        List<Car> cars = List.of(new Car("green", "2011"),
                                 new Car("red", "2010"),
                                 new Car("blue", "2018"));
    }
}
