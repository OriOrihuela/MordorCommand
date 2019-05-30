package org.lasencinas.commandpattern.pedido.tiposTratamiento;

import org.lasencinas.commandpattern.pedido.interfaces.Pedido;
import org.lasencinas.commandpattern.pedido.interfaces.TratamientoPedido;

import java.util.Set;

public class TratamientoPedidoMultiple implements TratamientoPedido {

    /* ---- PROPERTIES OF THE CLASS ---- */
    private Set<Pedido> pedidoSet = null;
    private double numBultos = 0;
    private double pesoTotal = 0;


    /* ---- CONSTRUCTORS ---- */
    public TratamientoPedidoMultiple() {
    }

    public TratamientoPedidoMultiple(Set<Pedido> pedidoSet) {
        this.pedidoSet = pedidoSet;
    }


    /* ---- GETTERS ---- */
    public Set<Pedido> getPedidoSet() {
        return pedidoSet;
    }

    public double getNumBultos() {
        return numBultos;
    }

    public double getPesoTotal() {
        return pesoTotal;
    }

    /* ---- BEHAVIOURS ---- */
    @Override
    public boolean tratar() {
        calcularPesoTotal();
        calcularTotalBultos();
        if (getPesoTotal() > 0 && getPedidoSet().size() == 3) {
            return true;
        }
        return false;
    }

    public void calcularTotalBultos() {
        for (Pedido pedido : getPedidoSet()) {
            numBultos += 1;
        }
    }

    public void calcularPesoTotal() {
        for (Pedido pedido : getPedidoSet()) {
            pesoTotal += pedido.peso();
        }
    }
}
