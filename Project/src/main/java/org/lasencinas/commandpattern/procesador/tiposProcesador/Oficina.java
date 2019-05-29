package org.lasencinas.commandpattern.procesador.tiposProcesador;

import org.lasencinas.commandpattern.pedido.interfaces.TratamientoPedido;
import org.lasencinas.commandpattern.procesador.interfaces.Procesador;

public class Oficina implements Procesador {

    /* ---- CONSTRUCTOR ---- */
    public Oficina() {

    }


    /* ---- MAIN BEHAVIOURS ---- */
    @Override
    public boolean procesa(TratamientoPedido pedido) {
        return false;
    }
}
