package org.mvpigs.commandpattern.pedidos;

import org.mvpigs.commandpattern.interfaces.Pedido;
import java.util.UUID;

public class PedidoInternacional implements Pedido {

    public int peso;
    public String destino;
    public String id;

    //constructor
    public PedidoInternacional(String destino, int peso) {
        setDestino(destino);
        setPeso(peso);
        setId(UUID.randomUUID().toString());
    }
    /**
     * @return the destino
     */
    public String destino() {
        return this.destino;
    }
    public String getId() {
        return this.id;
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
    public void setId(String id) {
        this.id = id;
    }

}