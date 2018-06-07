package org.mvpigs.commandpattern.tratamientos;

import org.mvpigs.commandpattern.interfaces.Pedido;
import org.mvpigs.commandpattern.interfaces.TratamientoPedido;

public class TratamientoPedidoInternacional implements TratamientoPedido {

    public Pedido pedidoATratar;

    public TratamientoPedidoInternacional( Pedido pedidoInternacional) {
        this.pedidoATratar = pedidoInternacional;
    }

    public boolean tratar() {

        if (pedidoATratar.destino() == "Mordor") {
            return false;
        } 
        
        return true;
    }
}