package com.br.durex.maratonaJava.core.enumeracao.teste;

import com.br.durex.maratonaJava.core.enumeracao.dominio.Cliente;
import com.br.durex.maratonaJava.core.enumeracao.dominio.TipoCliente;
import com.br.durex.maratonaJava.core.enumeracao.dominio.TipoPagamento;

public class ClienteTeste {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Augusto", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Mercedes Ltda", TipoCliente.PESSOA_JURIRICA, TipoPagamento.DEBITO);

        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(50));

        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente2);
    }
}
