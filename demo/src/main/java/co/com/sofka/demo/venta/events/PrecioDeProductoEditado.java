package co.com.sofka.demo.venta.events;

import co.com.sofka.demo.venta.values.IdProducto;
import co.com.sofka.demo.venta.values.Precio;
import co.com.sofka.domain.generic.*;

public class PrecioDeProductoEditado extends DomainEvent {
    private final IdProducto idProducto;
    private final Precio precio;
    public PrecioDeProductoEditado(IdProducto idProducto, Precio precio) {
        super("PrecioDeProductoEditado");
        this.idProducto = idProducto;
        this.precio = precio;
    }

}
