package co.com.sofka.demo.Empleado;

import co.com.sofka.demo.Empleado.value.Funcion;
import co.com.sofka.demo.Empleado.value.IdCajero;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Cajero extends Entity<IdCajero> {

    protected Funcion funcion;

    public Cajero(IdCajero idCajero, Funcion funcion) {
        super(idCajero);
        this.funcion = funcion;
    }

    public void actualizarFuncion(Funcion funcion){
        this.funcion = Objects.requireNonNull(funcion);
    }

    public Funcion funcion() {
        return funcion;
    }
}
