package org.lasencinas.commandpattern.pedido.interfaces;

/**
 * La interfaz Pedido implementa los metodos:
 * <p>
 * peso
 *
 * @param void
 * @return el peso del pedido
 * <p>
 * destino
 * @return el destino del pedido
 */

public interface Pedido {

    /* ---- MAIN BEHAVIOURS ---- */
    public int peso();

    public String destino();
}
