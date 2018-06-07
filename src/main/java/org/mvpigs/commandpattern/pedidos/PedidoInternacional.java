package org.mvpigs.commandpattern.pedidos;

import org.mvpigs.commandpattern.interfaces.Pedido;

public class PedidoInternacional implements Pedido {

    public int peso;
    public String destino;

    //constructor
    public PedidoInternacional(String destino, int peso) {
        setDestino(destino);
        setPeso(peso);
    }
    /**
     * @return the destino
     */
    public String destino() {
        return this.destino;
    }
    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }
    /**
     * @return the peso
     */
    public int peso() {
        return this.peso;
    }
    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

}