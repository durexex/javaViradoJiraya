package com.br.durex.maratonaJava.core.introducaometodos.teste;

import com.br.durex.maratonaJava.core.introducaometodos.dominio.Calculadora;

public class CalculadoraTeste05 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int[] numeros = {1, 2, 3, 4, 5};
        calc.somaArray(numeros);

        calc.somaVarArgs(1, 2, 3 ,4 ,5, 7, 8);
    }
}
