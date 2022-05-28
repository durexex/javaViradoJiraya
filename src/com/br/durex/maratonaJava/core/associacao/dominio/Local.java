package com.br.durex.maratonaJava.core.associacao.dominio;

public class Local {
    private String endereco;

    public Local() {
    }

    public Local(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
