package com.br.durex.maratonaJava.core.introducaometodos.teste;

import com.br.durex.maratonaJava.core.introducaometodos.dominio.Funcionario;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Josias", 12);

        funcionario.adicinarSalario(152);
        funcionario.adicinarSalario(180);
        funcionario.adicinarSalario(250);

        funcionario.imprimir();

        System.out.println("Média " + funcionario.mediaSalarial());

    }
}
