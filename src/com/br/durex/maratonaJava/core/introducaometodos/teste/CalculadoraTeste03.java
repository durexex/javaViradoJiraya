package com.br.durex.maratonaJava.core.introducaometodos.teste;

import com.br.durex.maratonaJava.core.introducaometodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int num1 = 1;
        int num2 = 2;

        calc.alteraDoisNumeros(num1, num2);

        System.out.println(num1);
        System.out.println(num2);
    }


}
