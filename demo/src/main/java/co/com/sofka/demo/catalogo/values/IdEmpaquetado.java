package co.com.sofka.demo.catalogo.values;

import co.com.sofka.domain.generic.Identity;

public class IdEmpaquetado extends Identity {
    private IdEmpaquetado(String value){
        super(value);
    }

    public IdEmpaquetado(){
    }

    public static IdEmpaquetado of(String value){
        return new IdEmpaquetado(value);
    }
}
