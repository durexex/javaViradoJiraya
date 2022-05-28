package com.br.durex.maratonaJava.core.associacao.teste;

import com.br.durex.maratonaJava.core.associacao.dominio.Aluno;
import com.br.durex.maratonaJava.core.associacao.dominio.Local;
import com.br.durex.maratonaJava.core.associacao.dominio.Professor;
import com.br.durex.maratonaJava.core.associacao.dominio.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua Marcelo Augusto 98, Coqueiros");
        Aluno aluno = new Aluno("Jubilelton", 15);
        Professor professor = new Professor("Rorberto Rohr", "Matemática");
        Aluno[] alunosSeminario = {aluno};
        Seminario seminario = new Seminario("Matematico virado num alho", alunosSeminario, local);

        Seminario[] seminarios = {seminario};
        professor.setSeminarios(seminarios);

        professor.imprimir();
    }
}
