package co.com.sofka.demo.Empleado.event;

import co.com.sofka.demo.Generico.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreActualizado extends DomainEvent {

    private final Nombre nombre;

    public NombreActualizado(Nombre nombre) {
        super("NombreActualizado");
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
