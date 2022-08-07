package com.br.durex.maratonaJava.core.generics.Service;

import com.br.durex.maratonaJava.core.generics.dominio.Barco;
import com.br.durex.maratonaJava.core.generics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class RentalService<T> {
    private List<T> objetosDisponiveis;

    public RentalService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T buscarObjetoDisponivel() {
        System.out.println("Buscando objeto disponivel");

        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando objeto " + t);
        System.out.println("Objetos disponivels para alugar");
        System.out.println(objetosDisponiveis);

        return t;
    }

    public void retornarObjetoAlugado(T t) {
        System.out.println("Devolvendo objeto " + t);

        objetosDisponiveis.add(t);

        System.out.println("Objetos disp ");
        System.out.println(objetosDisponiveis);
    }

}
