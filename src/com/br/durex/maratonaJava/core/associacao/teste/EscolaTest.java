package com.br.durex.maratonaJava.core.associacao.teste;

import com.br.durex.maratonaJava.core.associacao.dominio.Escola;
import com.br.durex.maratonaJava.core.associacao.dominio.Professor;

public class EscolaTest {
    public static void main(String[] args) {
        Professor professor = new Professor("Marcelo");
        Professor professor2 = new Professor("Nerdzão");

        Professor[] professores = {professor, professor2};
        Escola escola = new Escola("EEB Juliandreisson", professores);

        escola.imprimir();
    }
}
