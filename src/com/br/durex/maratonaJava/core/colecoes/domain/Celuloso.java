package com.br.durex.maratonaJava.core.colecoes.domain;

public class Celuloso {
    private String serialNumber;
    private String marca;

    public Celuloso(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        if (obj==null)
            return false;

        if (this==obj)
            return true;

        if (this.getClass() != obj.getClass())
            return false;

        Celuloso cel = (Celuloso) obj;

        return serialNumber != null && serialNumber.equals(cel.serialNumber);
    }


    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
