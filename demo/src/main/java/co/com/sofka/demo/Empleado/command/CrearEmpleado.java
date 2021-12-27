package co.com.sofka.demo.Empleado.command;

import co.com.sofka.demo.Empleado.value.IdEmpleado;
import co.com.sofka.demo.Generico.Nombre;
import co.com.sofka.domain.generic.Command;

public class CrearEmpleado extends Command {
    private final IdEmpleado idEmpleado;
    private final Nombre nombre;

    public CrearEmpleado(IdEmpleado idEmpleado, Nombre nombre) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
    }

    public IdEmpleado getIdEmpleado() {
        return idEmpleado;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
