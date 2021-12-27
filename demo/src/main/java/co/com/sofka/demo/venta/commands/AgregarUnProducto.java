package co.com.sofka.demo.venta.commands;

import co.com.sofka.demo.venta.values.Factura;
import co.com.sofka.demo.venta.values.IdProducto;
import co.com.sofka.demo.venta.values.Precio;
import co.com.sofka.domain.generic.Command;

public class AgregarUnProducto extends Command {
    private final IdProducto idProducto;
    private final Precio precio;
    private final Factura factura;

    public AgregarUnProducto(IdProducto idProducto, Precio precio, Factura factura) {
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


    public Factura getfactura() {
        return factura;
    }
}
