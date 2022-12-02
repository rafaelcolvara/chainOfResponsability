package org.example;

import org.example.entity.Cliente;
import org.example.validacoesDil.ValidaBTC;
import org.example.validacoesDil.ValidaTermo;
import org.example.validacoesDil.ValidacaoVazia;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
         Cliente cliente = new Cliente();
         cliente.setIdCliente(1);
         cliente.setNomeCliente("Rafael");

         Boolean validacaoRealizada = new ValidaBTC( new ValidaTermo(new ValidacaoVazia()))
                 .validarDil(cliente);



    }
}
