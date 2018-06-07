package org.mvpigs.commandpattern.tratamientos;

import java.util.ArrayList;
import java.util.Set;

import org.mvpigs.commandpattern.interfaces.Pedido;
import org.mvpigs.commandpattern.interfaces.TratamientoPedido;
import org.mvpigs.commandpattern.pedidos.PedidoNacional;

public class TratamientoPedidoMultiple implements TratamientoPedido {

    private Set<PedidoNacional> pedidos;
    private int pesoTotal;
    private int numBultos;

    public TratamientoPedidoMultiple(Set<PedidoNacional> pedidos) {
        this.pedidos = pedidos;
    }

    public boolean tratar() {

        this.calcularPesoTotal();
        this.calcularTotalBultos();

        if ( this.pesoTotal > 0 && this.numBultos == pedidos.size()) {
            return true;
        }

        return false;
    }

    public int getNumBultos() {
        return this.numBultos;
    }

    public int getPesoTotal() {
        return this.pesoTotal;
    }

    public void calcularTotalBultos() {

        this.numBultos = this.pedidos.size();
    }

    public void calcularPesoTotal() {

        for (Pedido pedido : pedidos) {
            this.pesoTotal += pedido.peso();
        }
    }
}