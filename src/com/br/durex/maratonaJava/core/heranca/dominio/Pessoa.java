package com.br.durex.maratonaJava.core.heranca.dominio;

public class Pessoa {
    private String nome;
    private String cpf;
    private Endereco endereco;
    
    static {
        System.out.println("Dentro static pessoa");
    }
    {
        System.out.println("Inicialização não static 1");
    }
    {
        System.out.println("Inicialização não static 2");
    }

    public String getNome() {
        return nome;
    }

    public Pessoa() {
    }

    public Pessoa(String nome) {
        System.out.println("Dentor construtor Pessoa");
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void imprimir() {
        System.out.println(nome);
        System.out.println(cpf);

        System.out.println(endereco.getRua());
        System.out.println(endereco.getCep());

    }
}
