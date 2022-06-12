package com.br.durex.maratonaJava.core.exception.runtime.teste;

public class RuntimeExceptionTeste04 {
    public static void main(String[] args) {
        abreConexao();
    }

    private static String abreConexao() {
        try {
            throw new RuntimeException;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("");
        } catch (IndexOutOfBoundsException){
            System.out.println("");
        } catch (IllegalAccessError){
            System.out.println("");
        } catch (ArithmeticException){
            System.out.println("");
        } catch (RuntimeException){
            System.out.println("");
        }

        // Tipos mais genéricos sempre abaixo


        return null;
    }
}
