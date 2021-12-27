package co.com.sofka.demo.venta.values;

import co.com.sofka.domain.generic.Identity;

public class IdOrden extends Identity {
    public IdOrden(String value) {
        super(value);
    }

    public IdOrden(){
    }

    public static IdOrden of(String value){
        return new IdOrden(value);
    }
}
