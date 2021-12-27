package co.com.sofka.demo.venta.commands;

import co.com.sofka.demo.venta.values.IdProducto;
import co.com.sofka.demo.venta.values.Precio;
import co.com.sofka.domain.generic.Command;

public class EditarPrecioDeUnProducto extends Command {
    private final IdProducto idProducto;
    private final Precio precio;


    public EditarPrecioDeUnProducto(IdProducto idProducto, Precio precio) {
        this.idProducto = idProducto;
        this.precio = precio;
    }

    public IdProducto getIdProducto() {
        return idProducto;
    }

    public Precio getPrecio() {
        return precio;
    }
}
