package com.br.durex.maratonaJava.core.polimorfismo.service;

import com.br.durex.maratonaJava.core.polimorfismo.repositorio.Repositorio;

public class RepositorioBancoDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando banco dados");
    }
}
