package com.br.durex.maratonaJava.core.exception.runtime.teste;

import static java.lang.System.out;

public class RuntimeExceptionTeste04 {
    public static void main(String[] args) {
        abreConexao();
    }

    private static String abreConexao() {
        try {
            throw new RuntimeException;

        } catch (ArrayIndexOutOfBoundsException e) {
            out.println("");
        } catch (IndexOutOfBoundsException){
            out.println("");
        } catch (IllegalAccessError){
            out.println("");
        } catch (ArithmeticException){
            out.println("");
        } catch (RuntimeException){
            out.println("");
        }

        // Tipos mais genéricos sempre abaixo


        return null;
    }
}
