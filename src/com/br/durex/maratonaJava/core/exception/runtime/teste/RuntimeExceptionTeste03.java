package com.br.durex.maratonaJava.core.exception.runtime.teste;

public class RuntimeExceptionTeste03 {
    public static void main(String[] args) {
        abreConexao();
    }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            new Exception("deu ruim");
            return "Conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Liberando recurso do Sistema operacional");

        }

        return null;
    }
}
