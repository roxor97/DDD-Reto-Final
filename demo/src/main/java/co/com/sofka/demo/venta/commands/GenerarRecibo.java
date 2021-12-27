package co.com.sofka.demo.venta.commands;

import co.com.sofka.demo.catalogo.values.Precio;
import co.com.sofka.demo.venta.values.IdCliente;
import co.com.sofka.domain.generic.Command;

public class GenerarRecibo extends Command {
    private final IdCliente idCliente;
    private final Precio precio;

    public GenerarRecibo(IdCliente idCliente, Precio precio) {
        this.idCliente = idCliente;
        this.precio = precio;
    }

    public IdCliente getIdCliente() {
        return idCliente;
    }

    public Precio getPrecio() {
        return precio;
    }
}
