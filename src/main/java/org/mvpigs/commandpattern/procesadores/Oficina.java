package org.mvpigs.commandpattern.procesadores;

import org.mvpigs.commandpattern.interfaces.Pedido;
import org.mvpigs.commandpattern.interfaces.Procesador;
import org.mvpigs.commandpattern.interfaces.TratamientoPedido;

public class Oficina implements Procesador {


    public boolean procesa(TratamientoPedido pedido) {
        return pedido.tratar();
    }

    private enum EstadoPedido {
        ACEPTADO, RECHAZADO
    }

    public String printarStatus(Boolean procesa, Pedido pedidoAProcesar) {
        
        if ( procesa == true ) {
            return pedidoAProcesar.destino()+" " + EstadoPedido.ACEPTADO.name();
        }

        return pedidoAProcesar.destino()+" " + EstadoPedido.RECHAZADO.name();
    }
}