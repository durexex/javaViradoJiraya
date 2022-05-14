package com.br.durex.maratonaJava.core.introducaoclasses.dominio;

public class Carro {

    private String marca;
    private String Modelo;
    private int ano;

    public Carro() {

    }

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        Modelo = modelo;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", Modelo='" + Modelo + '\'' +
                ", ano=" + ano +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
