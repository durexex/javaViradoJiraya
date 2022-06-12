package com.br.durex.maratonaJava.core.exception.runtime.teste;

public class RuntimeExceptionTest {
    public static void main(String[] args) {
        try {
            System.out.println(division(1, 4));
        } catch (RuntimeException e) {
            System.out.println("Deu ruim total");
        }
    }

    /**
     *
     *
     * @param a
     * @param b não pode ser zero
     * @return
     * @throws IllegalArgumentException
     */
    private static int division(int a, int b) throws IllegalArgumentException {
//        try {
//            return a/b;
//        } catch (RuntimeException e) {
//            e.printStackTrace();
//        }

        if (b ==0) {
            throw new IllegalArgumentException("Faz direito meu");
        }
        return a/b;
    }
}
