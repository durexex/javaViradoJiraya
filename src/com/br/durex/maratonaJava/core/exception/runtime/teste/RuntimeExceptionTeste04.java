package com.br.durex.maratonaJava.core.exception.runtime.teste;

import static java.lang.System.out;

public class RuntimeExceptionTeste04 {
    public static void main(String[] args) {
        abreConexao();
    }

    private static String abreConexao() {
        try {
            throw new RuntimeException();

        } catch (ArrayIndexOutOfBoundsException e) {
            out.println("");
        } catch (IndexOutOfBoundsException e){
            out.println("");
        } catch (IllegalAccessError e){
            out.println("");
        } catch (ArithmeticException e){
            out.println("");
        } catch (RuntimeException e){
            out.println("");
        }

        // Tipos mais genéricos sempre abaixo


        return null;
    }
}
