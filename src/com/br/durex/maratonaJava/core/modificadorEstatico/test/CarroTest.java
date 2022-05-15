package com.br.durex.maratonaJava.core.modificadorEstatico.test;

import com.br.durex.maratonaJava.core.modificadorEstatico.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro("BMW", 350);
        Carro carro2 = new Carro("Porsche", 400);
        Carro carro3 = new Carro("Audi", 280);

        Carro.setVelocidadeLimite(50);

        carro1.imprimir();;
        carro2.imprimir();;
        carro3.imprimir();;

    }
}
