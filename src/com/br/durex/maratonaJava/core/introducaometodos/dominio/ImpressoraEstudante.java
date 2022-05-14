package com.br.durex.maratonaJava.core.introducaometodos.dominio;

import com.br.durex.maratonaJava.core.introducaometodos.dominio.Estudante;

public class ImpressoraEstudante {
    public void Imprimir(Estudante estudante) {
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    };

}
