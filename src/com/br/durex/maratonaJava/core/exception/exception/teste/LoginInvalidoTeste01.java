package com.br.durex.maratonaJava.core.exception.exception.teste;

import com.br.durex.maratonaJava.core.exception.dominio.LoginInvalidoException;

public class LoginInvalidoTeste01  {
    public static void main(String[] args) {

    }

    private static void logar() throws LoginInvalidoException {
        Scanner tecaldo = new Scanner(System.in);
        String uesrnameDB = "Goku";
        String senhaDB = "edl";
        System.out.println("User");
        String username = teclado.nextLine();
        System.out.println("Senha");
        String senha = teclado.nextLine();

        if (!usernameDB.equals(username) || !senhaDB.equals(senha)) {
            throw new LoginInvalidoException("Deu ruim");
        }

        System.out.println("logado");
    }


}
