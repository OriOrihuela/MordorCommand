package org.lasencinas.commandpattern.pedido.tiposPedido;


import org.lasencinas.commandpattern.pedido.interfaces.PedidoPeligroso;

public class PedidoPeligrosoOrden implements PedidoPeligroso {

    /* ---- PROPERTIES OF THE CLASS ---- */
    private String destino = null;
    private String pesoString = null;
    private int peso = 0;


    /* ---- CONSTRUCTORS ---- */
    public PedidoPeligrosoOrden() {
    }

    public PedidoPeligrosoOrden(String destino, String pesoString) {
        this.destino = destino;
        this.pesoString = pesoString;
    }

    /* ---- GETTERS ---- */
    public String getPesoString() {
        return pesoString;
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
