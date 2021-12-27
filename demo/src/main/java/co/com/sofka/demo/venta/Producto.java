package co.com.sofka.demo.venta;
import co.com.sofka.demo.venta.values.*;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Producto extends Entity<IdProducto> {

    private final Factura factura;
    private Precio precio;

    public Producto(IdProducto idProducto, Precio precio, Factura recibo){
        super(idProducto);
        this.precio = Objects.requireNonNull(precio);
        this.factura = Objects.requireNonNull(recibo);
    }

    public void editarPrecio(Precio precio){
        this.precio = Objects.requireNonNull(precio);
    }

    public Precio precio(){
        return precio;
    }


    public Factura recibo(){
        return factura;
    }



}
