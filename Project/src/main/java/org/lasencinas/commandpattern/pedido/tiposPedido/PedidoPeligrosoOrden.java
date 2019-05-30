package org.lasencinas.commandpattern.pedido.tiposPedido;


import org.lasencinas.commandpattern.pedido.interfaces.PedidoPeligroso;

import java.util.UUID;

public class PedidoPeligrosoOrden implements PedidoPeligroso {

    /* ---- PROPERTIES OF THE CLASS ---- */
    private String destino = null;
    private String instrucciones = null;
    private UUID uuid = null;
    private int peso = 0;


    /* ---- CONSTRUCTORS ---- */
    public PedidoPeligrosoOrden() {
        this.uuid = UUID.randomUUID();
    }

    public PedidoPeligrosoOrden(String destino, String pesoString) {
        this.destino = destino;
        this.instrucciones = pesoString;
        this.uuid = UUID.randomUUID();
    }

    /* ---- GETTERS ---- */
    @Override
    public String instrucciones() {
        return instrucciones;
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
}
