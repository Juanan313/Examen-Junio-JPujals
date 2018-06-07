package org.mvpigs.commandpattern.tratamientos;

import org.mvpigs.commandpattern.interfaces.Pedido;
import org.mvpigs.commandpattern.interfaces.PedidoPeligroso;
import org.mvpigs.commandpattern.interfaces.TratamientoPedido;

public class TratamientoPedidoPeligroso implements TratamientoPedido {

    private PedidoPeligroso pedidoATratar;

    public TratamientoPedidoPeligroso( PedidoPeligroso pedidoPeligroso) {
        this.pedidoATratar = pedidoPeligroso;
    }

    public boolean tratar() {

        if (pedidoATratar.instrucciones() == "no ponerselo en el dedo") {
            return false;
        } 
        
        return true;
    }
}