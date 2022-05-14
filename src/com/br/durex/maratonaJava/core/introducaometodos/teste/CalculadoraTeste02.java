package com.br.durex.maratonaJava.core.introducaometodos.teste;

import com.br.durex.maratonaJava.core.introducaometodos.dominio.Calculadora;

public class CalculadoraTeste02 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        calc.multiplicarDoisNumeros(5, 15);

        double resultado = calc.dividirDoisNumeros(55.5, 26.3);
        System.out.println(resultado);
    }


}
