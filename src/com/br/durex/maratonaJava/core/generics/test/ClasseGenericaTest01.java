package com.br.durex.maratonaJava.core.generics.test;

import com.br.durex.maratonaJava.core.generics.Service.CarroRentavelService;
import com.br.durex.maratonaJava.core.generics.dominio.Carro;
import org.w3c.dom.ls.LSOutput;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();

        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando carro");
        carroRentavelService.retornarCarroAlugado(carro);

    }

}
