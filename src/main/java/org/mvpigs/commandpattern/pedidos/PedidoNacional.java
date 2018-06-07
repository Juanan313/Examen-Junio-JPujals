package org.mvpigs.commandpattern.pedidos;

import java.util.UUID;
import org.mvpigs.commandpattern.interfaces.Pedido;

public class PedidoNacional implements Pedido {

    private int peso;
    private String destino;
    private String id;

    //constructor
    public PedidoNacional(String destino, int peso) {
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