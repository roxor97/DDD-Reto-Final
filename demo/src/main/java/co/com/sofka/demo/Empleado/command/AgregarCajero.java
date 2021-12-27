package co.com.sofka.demo.Empleado.command;

import co.com.sofka.demo.Empleado.value.Funcion;
import co.com.sofka.demo.Empleado.value.IdCajero;
import co.com.sofka.demo.Empleado.value.IdEmpleado;
import co.com.sofka.domain.generic.Command;

public class AgregarCajero extends Command {
    private final IdEmpleado idEmpleado;
    private final IdCajero idCajero;
    private final Funcion funcion;

    public AgregarCajero(IdEmpleado idEmpleado, IdCajero idCajero, Funcion funcion) {
        this.idEmpleado = idEmpleado;
        this.idCajero = idCajero;
        this.funcion = funcion;
    }

    public IdEmpleado getIdEmpleado() {
        return idEmpleado;
    }

    public IdCajero getIdCajero() {
        return idCajero;
    }

    public Funcion getFuncion() {
        return funcion;
    }
}
