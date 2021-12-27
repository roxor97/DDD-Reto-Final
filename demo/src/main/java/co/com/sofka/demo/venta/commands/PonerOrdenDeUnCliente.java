package co.com.sofka.demo.venta.commands;

import co.com.sofka.demo.venta.Cliente;
import co.com.sofka.demo.venta.Orden;
import co.com.sofka.domain.generic.Command;

public class PonerOrdenDeUnCliente extends Command {
    private final Cliente cliente;
    private final Orden orden;

    public PonerOrdenDeUnCliente(Cliente cliente, Orden orden) {
        this.cliente = cliente;
        this.orden = orden;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Orden getOrden() {
        return orden;
    }
}
