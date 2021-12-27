package co.com.sofka.demo.catalogo.values;

import co.com.sofka.domain.generic.Identity;

public class IdCatalogo extends Identity {
    private IdCatalogo(String value){
        super(value);
    }

    public IdCatalogo(){
    }

    public static IdCatalogo of(String value){
        return new IdCatalogo(value);
    }
}
