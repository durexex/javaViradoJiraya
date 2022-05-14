package com.br.durex.maratonaJava.core.introducaoclasses.teste;

import com.br.durex.maratonaJava.core.introducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.nome = "Marcelo Augusto";
        estudante.idade = 18;
        estudante.sexo = 'M';

        System.out.println(estudante);
    }
}
