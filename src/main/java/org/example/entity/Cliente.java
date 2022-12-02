package org.example.entity;

public class Cliente {

    private Integer idCliente;
    private String NomeCliente;
    private Boolean flgBTC;
    private Boolean flgTermo;


    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return NomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        NomeCliente = nomeCliente;
    }

    public Boolean getFlgBTC() {
        return flgBTC;
    }

    public void setFlgBTC(Boolean flgBTC) {
        this.flgBTC = flgBTC;
    }

    public Boolean getFlgTermo() {
        return flgTermo;
    }

    public void setFlgTermo(Boolean flgTermo) {
        this.flgTermo = flgTermo;
    }
}
