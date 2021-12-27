package co.com.sofka.demo.Empleado;

import co.com.sofka.demo.Empleado.value.Funcion;
import co.com.sofka.demo.Empleado.value.IdVendedor;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Vendedor extends Entity<IdVendedor> {

    protected Funcion funcion;

    public Vendedor(IdVendedor idVendedor, Funcion funcion) {
        super(idVendedor);
        this.funcion = funcion;
    }

    public void actualizarFuncion(Funcion funcion){
        this.funcion = Objects.requireNonNull(funcion);
    }

    public Funcion funcion() {
        return funcion;
    }
}
