package org.lasencinas.commandpattern.pedido.tiposPedido;


import org.lasencinas.commandpattern.pedido.interfaces.PedidoPeligroso;

import java.util.UUID;

public class PedidoPeligrosoOrden implements PedidoPeligroso {

    /* ---- PROPERTIES OF THE CLASS ---- */
    private String destino = null;
    private String pesoString = null;
    private UUID uuid = null;
    private int peso = 0;


    /* ---- CONSTRUCTORS ---- */
    public PedidoPeligrosoOrden() {
        this.uuid = UUID.randomUUID();
    }

    public PedidoPeligrosoOrden(String destino, String pesoString) {
        this.destino = destino;
        this.pesoString = pesoString;
        this.uuid = UUID.randomUUID();
    }

    /* ---- GETTERS ---- */
    public String getPesoString() {
        return pesoString;
    }

    public UUID getId() {
        return uuid;
    }

    @Override
    public int peso() {
        return peso;
    }

    @Override
    public String destino() {
        return destino;
    }


    /* ---- MAIN BEHAVIOURS ---- */
    @Override
    public String instrucciones() {
        return null;
    }
}
