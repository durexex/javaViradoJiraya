package com.br.durex.maratonaJava.core.classesAbstratas.testes;

import com.br.durex.maratonaJava.core.classesAbstratas.dominio.Dev;
import com.br.durex.maratonaJava.core.classesAbstratas.dominio.Funcionario;
import com.br.durex.maratonaJava.core.classesAbstratas.dominio.Gerente;

public class FuncionarioTeste01 {

    public static void main(String[] args) {

        Gerente gerente = new Gerente("Geres", 5000);
        System.out.println(gerente);

        Dev dev = new Dev("coitado", 100);
        System.out.println(dev);

    }
}
