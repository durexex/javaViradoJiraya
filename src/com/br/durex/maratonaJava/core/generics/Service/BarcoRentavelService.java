package com.br.durex.maratonaJava.core.generics.Service;

import com.br.durex.maratonaJava.core.generics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("lancha"),
                                                                    new Barco("canoa")
                                                                    )
                                                            );

    public Barco buscarBarcoDisponivel() {
        System.out.println("Buscando barco disponivel");

        Barco barco = barcosDisponiveis.remove(0);
        System.out.println("Alugando barco " + barco);
        System.out.println("Barcos disponivels para alugar");
        System.out.println(barcosDisponiveis);

        return barco;
    }

    public void retornarBarcoAlugado(Barco barco) {
        System.out.println("Devolvendo barco " + barco);

        barcosDisponiveis.add(barco);

        System.out.println("Barcos disp ");
        System.out.println(barcosDisponiveis);
    }

}
