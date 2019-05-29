package org.lasencinas.pedido.interfaces;

/**
 * La interfaz TratamientoPedido implementa el metodo
 * tratar
 *
 * @param void
 * @return boolean
 * true si se cumplen las condiciones para tratar el pedido
 * false si no se cumplen las condiciones para tratar el pedido
 */

public interface TratamientoPedido {

    /* ---- MAIN BEHAVIOURS ---- */
    boolean tratar();
}
