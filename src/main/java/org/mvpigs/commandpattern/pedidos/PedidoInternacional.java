package org.mvpigs.commandpattern.pedidos;

import org.mvpigs.commandpattern.interfaces.Pedido;
import java.util.UUID;

public class PedidoInternacional implements Pedido {

    private int peso;
    private String destino;
    private String id;

    //constructor
    public PedidoInternacional(String destino, int peso) {
        setDestino(destino);
        setPeso(peso);
        setId(UUID.randomUUID().toString());
    }

    // Getters 
    public String destino() {
        return this.destino;
    }

    public String getId() {
        return this.id;
    }

    public int peso() {
        return this.peso;
    }

    //Setters
    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setId(String id) {
        this.id = id;
    }

}