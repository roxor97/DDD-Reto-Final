package co.com.sofka.demo.Empleado;

import co.com.sofka.demo.Empleado.value.Funcion;
import co.com.sofka.demo.Empleado.value.IdGerente;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Gerente extends Entity<IdGerente> {

    protected Funcion funcion;

    public Gerente(IdGerente idGerente, Funcion funcion) {
        super(idGerente);
        this.funcion = funcion;
    }

    public void actualizarFuncion(Funcion funcion){
        this.funcion = Objects.requireNonNull(funcion);
    }

    public Funcion funcion() {
        return funcion;
    }
}
