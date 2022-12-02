package org.example.validacoesDil;

import org.example.abstractClass.ValidacaoDil;
import org.example.entity.Cliente;

public class ValidaTermo extends ValidacaoDil {

    public ValidaTermo(ValidacaoDil proximaValidacao) {

        super( proximaValidacao);
    }

    public Boolean validarDil(Cliente cliente) {

        System.out.println("Validou termo");
        return proximaValidacaoDil.validarDil(cliente);

    }


}
