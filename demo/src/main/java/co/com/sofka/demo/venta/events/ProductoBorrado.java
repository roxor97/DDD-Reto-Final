package co.com.sofka.demo.venta.events;

import co.com.sofka.demo.venta.values.IdProducto;
import co.com.sofka.domain.generic.*;

import java.util.Objects;

public class ProductoBorrado extends DomainEvent {
    private IdProducto idProducto;

    public ProductoBorrado(IdProducto idProducto) {
        super("ProductoBorrado");
        this.idProducto = Objects.requireNonNull(idProducto);
    }

    public IdProducto getIdProducto() {
        return idProducto;
    }

}
