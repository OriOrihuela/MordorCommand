package org.lasencinas.commandpattern.pedido.tiposTratamiento;

import org.lasencinas.commandpattern.pedido.interfaces.TratamientoPedido;
import org.lasencinas.commandpattern.pedido.tiposPedido.PedidoInternacional;

public class TratamientoPedidoInternacional implements TratamientoPedido {

    /* ---- PROPERTIES OF THE CLASS ---- */
    private PedidoInternacional pedidoInternacional = null;


    /* ---- CONSTRUCTOR ---- */
    public TratamientoPedidoInternacional() {
    }

    public TratamientoPedidoInternacional(PedidoInternacional pedidoInternacional) {
        this.pedidoInternacional = pedidoInternacional;
    }
    /* ---- MAIN BEHAVIOURS ---- */

    @Override
    public boolean tratar() {
        if (!pedidoInternacional.destino().equals("Mordor")) {
            return true;
        }
        return false;
    }
}
