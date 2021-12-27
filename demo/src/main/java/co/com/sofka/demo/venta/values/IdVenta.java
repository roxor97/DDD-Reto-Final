package co.com.sofka.demo.venta.values;

import co.com.sofka.domain.generic.Identity;

public class IdVenta extends Identity {
    private IdVenta(String value){
        super(value);
    }

    public IdVenta(){
    }

    public static IdVenta of(String value){
        return new IdVenta(value);
    }
}
