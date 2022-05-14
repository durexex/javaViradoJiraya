package com.br.durex.maratonaJava.core.introducaoclasses.teste;


import com.br.durex.maratonaJava.core.introducaoclasses.dominio.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Fiat", "tempra", 1996);
        Carro carro2 = new Carro("Ford", "Corcel", 1976);

        System.out.println(carro1);
        System.out.println(carro2);
    }

}
