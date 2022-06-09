package com.br.durex.maratonaJava.core.polimorfismo.teste;

import com.br.durex.maratonaJava.core.polimorfismo.repositorio.Repositorio;
import com.br.durex.maratonaJava.core.polimorfismo.service.RepositorioBancoDados;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDados();
        repositorio.salvar();
    }
}
