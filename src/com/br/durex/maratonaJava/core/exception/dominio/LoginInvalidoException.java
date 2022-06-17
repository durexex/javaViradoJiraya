package com.br.durex.maratonaJava.core.exception.dominio;

public class LoginInvalidoException extends Exception {
    public LoginInvalidoException() {
    }

    public LoginInvalidoException(String message) {
        super("Login inválido");
    }
}
