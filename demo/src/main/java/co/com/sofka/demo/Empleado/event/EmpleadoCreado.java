package co.com.sofka.demo.Empleado.event;

import co.com.sofka.demo.Empleado.Gerente;
import co.com.sofka.demo.Generico.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class EmpleadoCreado extends DomainEvent {
    private final Nombre nombre;
    private final Gerente gerente;

    public EmpleadoCreado(Nombre nombre, Gerente gerente) {
        super("EmpleadoCreado");
        this.nombre = nombre;
        this.gerente = gerente;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Gerente getGerente() {
        return gerente;
    }
}
