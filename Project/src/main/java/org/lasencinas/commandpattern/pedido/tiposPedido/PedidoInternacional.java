package org.lasencinas.commandpattern.pedido.tiposPedido;

import org.lasencinas.commandpattern.pedido.interfaces.Pedido;

public class PedidoInternacional implements Pedido {

    /* ---- PROPERTIES OF THE CLASS ---- */
    private String destino = null;
    private int peso = 0;

    /* ---- CONSTRUCTOR ---- */
    public PedidoInternacional() {
    }

    public PedidoInternacional(String destino, int peso) {
        this.destino = destino;
        this.peso = peso;
    }

    /* ---- MAIN BEHAVIOURS ---- */
    @Override
    public int peso() {
        return 0;
    }

    @Override
    public String destino() {
        return null;
    }
}
