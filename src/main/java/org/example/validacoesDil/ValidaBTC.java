package org.example.validacoesDil;

import org.example.entity.Cliente;
import org.example.abstractClass.ValidacaoDil;

public class ValidaBTC extends ValidacaoDil {

    public ValidaBTC(ValidacaoDil dil) {
        super(dil);
    }

    public Boolean validarDil(Cliente cliente) {
        System.out.println("Validou BTC");
        return proximaValidacaoDil.validarDil(cliente);
    }


}
