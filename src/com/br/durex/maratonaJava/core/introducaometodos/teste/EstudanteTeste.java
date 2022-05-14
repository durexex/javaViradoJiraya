package com.br.durex.maratonaJava.core.introducaometodos.teste;

import com.br.durex.maratonaJava.core.introducaometodos.dominio.Estudante;
import com.br.durex.maratonaJava.core.introducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
//        ImpressoraEstudante imp = new ImpressoraEstudante();

        estudante01.nome = "Minolta";
        estudante01.idade = 99;
        estudante01.sexo = 'F';

        estudante02.nome = "Arivaldo";
        estudante02.idade = 9;
        estudante02.sexo = 'M';

        estudante01.imprimir();
        estudante02.imprimir();

    }
}
