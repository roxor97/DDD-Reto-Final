package co.com.sofka.demo.Empleado.event;

import co.com.sofka.demo.Empleado.value.Funcion;
import co.com.sofka.demo.Empleado.value.IdGerente;
import co.com.sofka.domain.generic.DomainEvent;

public class GerenteActualizado extends DomainEvent {

    private final IdGerente idGerente;
    private final Funcion funcion;

    public GerenteActualizado(IdGerente idGerente, Funcion funcion) {
        super("GerenteActualizado");
        this.idGerente = idGerente;
        this.funcion = funcion;
    }

    public IdGerente getIdGerente() {
        return idGerente;
    }

    public Funcion getFuncion() {
        return funcion;
    }
}
