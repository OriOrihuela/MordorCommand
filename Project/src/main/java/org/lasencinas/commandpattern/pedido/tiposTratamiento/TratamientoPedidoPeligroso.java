package org.lasencinas.commandpattern.pedido.tiposTratamiento;

import org.lasencinas.commandpattern.pedido.interfaces.PedidoPeligroso;
import org.lasencinas.commandpattern.pedido.interfaces.TratamientoPedido;

public class TratamientoPedidoPeligroso implements TratamientoPedido {

    /* ---- PROPERTIES OF THE CLASS ---- */
    private PedidoPeligroso pedidoPeligrosoOrden = null;


    /* ---- CONSTRUCTOR ---- */
    public TratamientoPedidoPeligroso() {
    }

    public TratamientoPedidoPeligroso(PedidoPeligroso pedidoPeligrosoOrden) {
        this.pedidoPeligrosoOrden = pedidoPeligrosoOrden;
    }

    @Override
    public boolean tratar() {
        if (!pedidoPeligrosoOrden.destino().equals("Monte del destino")) {
            return true;
        }
        return false;
    }
}
