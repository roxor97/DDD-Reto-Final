package co.com.sofka.demo.venta.events;

import co.com.sofka.demo.venta.values.*;
import co.com.sofka.domain.generic.*;

public class ProductoAgregado extends DomainEvent {
    private final IdProducto idProducto;
    private final Precio precio;
    private final Factura factura;

    public ProductoAgregado(IdProducto idProducto, Precio precio, Factura factura) {
        super("ProductoAgregado");
        this.idProducto = idProducto;
        this.precio = precio;
        this.factura = factura;
    }

    public IdProducto getIdProducto() {
        return idProducto;
    }

    public Precio getPrecio() {
        return precio;
    }


    public Factura getFactura() {
        return factura;
    }
}
