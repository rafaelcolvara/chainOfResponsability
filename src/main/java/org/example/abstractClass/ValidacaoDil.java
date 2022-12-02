package org.example.abstractClass;

import org.example.entity.Cliente;

public abstract class ValidacaoDil {

    protected ValidacaoDil proximaValidacaoDil;
    public ValidacaoDil( ValidacaoDil proximo) {
        this.proximaValidacaoDil = proximo;
    }

    public abstract Boolean validarDil(Cliente cliente);

}


