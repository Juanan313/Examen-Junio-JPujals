package org.mvpigs.commandpattern.pedidos;

import org.mvpigs.commandpattern.interfaces.Pedido;
import org.mvpigs.commandpattern.interfaces.PedidoPeligroso;

public class PedidoPeligrosoOrden implements PedidoPeligroso {

    public int peso;
    public String destino;
    public String instrucciones;

    public PedidoPeligrosoOrden(String destino, String instrucciones) {
        setInstrucciones(instrucciones);
        setDestino(destino);
    }

    public int peso() {
        return this.peso;
    }

    public String destino() {
        return this.destino;
    }

    public String instrucciones() {
        return this.instrucciones;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }
}