package org.lasencinas.commandpattern.pedido.interfaces;

/**
 * La interfaz PedidoPeligroso implementa el metodo:
 * <p>
 * instrucciones
 *
 * @param void
 * @return String
 * <p>
 * Hereda de la interfaz Pedido
 */

public interface PedidoPeligroso extends Pedido {

    /* ---- MAIN BEHAVIOURS ---- */
    String instrucciones();
}