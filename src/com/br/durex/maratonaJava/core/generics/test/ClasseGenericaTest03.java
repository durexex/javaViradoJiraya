package com.br.durex.maratonaJava.core.generics.test;

import com.br.durex.maratonaJava.core.generics.Service.CarroRentavelService;
import com.br.durex.maratonaJava.core.generics.Service.RentalService;
import com.br.durex.maratonaJava.core.generics.dominio.Barco;
import com.br.durex.maratonaJava.core.generics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancka"), new Barco("Canoa")));

        RentalService<Carro> rentalServiceCarro = new RentalService<Carro>(carrosDisponiveis);

        Carro carro = rentalServiceCarro.buscarObjetoDisponivel();
        System.out.println("Usando carro");
        rentalServiceCarro.retornarObjetoAlugado(carro);

    }

}
