package co.com.sofka.demo.venta.events;

import co.com.sofka.demo.venta.values.IdCliente;
import co.com.sofka.demo.venta.values.Precio;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.Objects;

public class FacturaGenerado extends DomainEvent {
    private IdCliente idCliente;
    private Precio precio;
    public FacturaGenerado(IdCliente idCliente, Precio precio) {
            super("FacturaGenerado");
            this.precio = Objects.requireNonNull(precio);
            this.idCliente = Objects.requireNonNull(idCliente);
    }

    public IdCliente getIdCliente() {
        return idCliente;
    }

    public Precio getPrecio() {
        return precio;
    }
}
