package com.br.durex.maratonaJava.core.heranca.tetse;

import com.br.durex.maratonaJava.core.heranca.dominio.Endereco;
import com.br.durex.maratonaJava.core.heranca.dominio.Funcionario;
import com.br.durex.maratonaJava.core.heranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua Jacinto Aquino Rego");
        endereco.setCep("88048-655");

        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Manoal Mnene");
        pessoa.setCpf("445454545454");
        pessoa.setEndereco(endereco);
        pessoa.imprimir();


        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Robledo");
        funcionario.setCpf("555555555");
        funcionario.setEndereco(endereco);
        funcionario.imprimir();

    }
}
