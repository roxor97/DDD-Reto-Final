package co.com.sofka.demo.catalogo.values;

import co.com.sofka.domain.generic.Identity;

public class IdArticulo extends Identity {
    private IdArticulo(String value){
        super(value);
    }

    public IdArticulo(){
    }

    public static IdArticulo of(String value){
        return new IdArticulo(value);
    }
}
