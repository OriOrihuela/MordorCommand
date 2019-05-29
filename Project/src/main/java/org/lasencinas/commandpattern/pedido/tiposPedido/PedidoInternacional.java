package org.lasencinas.commandpattern.pedido.tiposPedido;

import org.lasencinas.commandpattern.pedido.interfaces.Pedido;

import java.util.UUID;

public class PedidoInternacional implements Pedido {

    /* ---- PROPERTIES OF THE CLASS ---- */
    private String destino = null;
    private UUID uuid = null;
    private int peso = 0;

    /* ---- CONSTRUCTOR ---- */
    public PedidoInternacional() {
        this.uuid = UUID.randomUUID();
    }

    public PedidoInternacional(String destino, int peso) {
        this.destino = destino;
        this.peso = peso;
        this.uuid = UUID.randomUUID();
    }


    /* ---- GETTERS ---- */
    public UUID getId() {
        return uuid;
    }

    /* ---- MAIN BEHAVIOURS ---- */
    @Override
    public int peso() {
        return peso;
    }

    @Override
    public String destino() {
        return destino;
    }
}
