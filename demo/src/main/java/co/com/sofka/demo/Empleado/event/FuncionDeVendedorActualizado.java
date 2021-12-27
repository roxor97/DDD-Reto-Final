package co.com.sofka.demo.Empleado.event;

import co.com.sofka.demo.Empleado.value.Funcion;
import co.com.sofka.demo.Empleado.value.IdVendedor;
import co.com.sofka.domain.generic.DomainEvent;

public class FuncionDeVendedorActualizado extends DomainEvent {

    private final IdVendedor idVendedor;
    private final Funcion funcion;

    public FuncionDeVendedorActualizado(IdVendedor idVendedor, Funcion funcion) {
        super("FuncionDeVendedorActualizado");
        this.idVendedor = idVendedor;
        this.funcion = funcion;
    }

    public IdVendedor getIdVendedor() {
        return idVendedor;
    }

    public Funcion getFuncion() {
        return funcion;
    }
}
