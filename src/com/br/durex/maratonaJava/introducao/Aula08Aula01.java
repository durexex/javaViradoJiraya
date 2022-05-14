package com.br.durex.maratonaJava.introducao;

public class Aula08Aula01 {
    public static void main(String[] args) {

        int[][] arrInt = new int[3][];

        arrInt[0] = new int[2];
        arrInt[1] = new int[]{1, 2, 3};
        arrInt[2] = new int[]{1, 2, 3, 4, 5, 6};

        for (int[] arryBase: arrInt) {
            System.out.println("\n----");
            for (int num: arryBase) {
                System.out.print(num);
            }
        }

    }
}
