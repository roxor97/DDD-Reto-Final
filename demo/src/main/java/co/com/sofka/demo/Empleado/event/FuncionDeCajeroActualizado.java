package co.com.sofka.demo.Empleado.event;

import co.com.sofka.demo.Empleado.value.Funcion;
import co.com.sofka.demo.Empleado.value.IdCajero;
import co.com.sofka.domain.generic.DomainEvent;

public class FuncionDeCajeroActualizado extends DomainEvent {

    private final IdCajero idCajero;
    private final Funcion funcion;

    public FuncionDeCajeroActualizado(IdCajero idCajero, Funcion funcion) {
        super("FuncionDeCajeroActualizado");
        this.idCajero = idCajero;
        this.funcion = funcion;
    }

    public IdCajero getIdCajero() {
        return idCajero;
    }

    public Funcion getFuncion() {
        return funcion;
    }
}
