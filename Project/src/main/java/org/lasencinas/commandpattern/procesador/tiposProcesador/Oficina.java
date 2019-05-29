package org.lasencinas.commandpattern.procesador.tiposProcesador;

import org.lasencinas.commandpattern.pedido.interfaces.Pedido;
import org.lasencinas.commandpattern.pedido.interfaces.TratamientoPedido;
import org.lasencinas.commandpattern.procesador.enums.Status;
import org.lasencinas.commandpattern.procesador.interfaces.Procesador;

public class Oficina implements Procesador {

    /* ---- CONSTRUCTOR ---- */
    public Oficina() {

    }


    /* ---- MAIN BEHAVIOURS ---- */
    @Override
    public boolean procesa(TratamientoPedido pedido) {
        if (pedido.tratar()) {
            return true;
        }
        return false;
    }

    public String printarStatus(boolean processable, Pedido pedido) {
        String stringToReturn = "";
        if (processable) {
            stringToReturn = pedido.destino() + " " + Status.ACEPTADO;
            return stringToReturn;
        }
        stringToReturn = pedido.destino() + " " + Status.RECHAZADO;
        return stringToReturn;
    }
}
