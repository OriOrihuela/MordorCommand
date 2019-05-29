package org.lasencinas.commandpattern.pedido.interfaces;

/**
 * La interfaz Pedido implementa los metodos:

 * peso
 *
 * @param void
 * @return el peso del pedido

 * destino
 * @return el destino del pedido
 */

public interface Pedido {

    /* ---- MAIN BEHAVIOURS ---- */
    public int peso();
    public String destino();
}
