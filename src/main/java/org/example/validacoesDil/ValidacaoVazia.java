package org.example.validacoesDil;

import org.example.abstractClass.ValidacaoDil;
import org.example.entity.Cliente;

public class ValidacaoVazia extends ValidacaoDil {

    public ValidacaoVazia() {
        super(null);
    }

    public Boolean validarDil(Cliente cliente) {
        System.out.println("Fim das validações");
        return true;
    }
}
