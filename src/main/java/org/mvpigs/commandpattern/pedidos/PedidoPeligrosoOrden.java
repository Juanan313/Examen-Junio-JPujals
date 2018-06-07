package org.mvpigs.commandpattern.pedidos;

import org.mvpigs.commandpattern.interfaces.Pedido;
import org.mvpigs.commandpattern.interfaces.PedidoPeligroso;
import java.util.UUID;

public class PedidoPeligrosoOrden implements PedidoPeligroso {

    private int peso;
    private String destino;
    private String instrucciones;
    private String id;

    public PedidoPeligrosoOrden(String destino, String instrucciones) {
        setInstrucciones(instrucciones);
        setDestino(destino);
        setId(UUID.randomUUID().toString());
    }

    //Getters
    public int peso() {
        return this.peso;
    }

    public String destino() {
        return this.destino;
    }

    public String instrucciones() {
        return this.instrucciones;
    }

    public String getId() {
        return this.id;
    }

    //Setters
    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public void setId(String id) {
        this.id = id;
    }
}