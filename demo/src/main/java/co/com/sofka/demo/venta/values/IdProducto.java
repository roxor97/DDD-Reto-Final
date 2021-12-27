package co.com.sofka.demo.venta.values;

import co.com.sofka.domain.generic.Identity;

public class IdProducto extends Identity {
    public IdProducto(String value) {
        super(value);
    }

    public IdProducto(){
    }

    public static IdProducto of(String value){
        return new IdProducto(value);
    }
}
