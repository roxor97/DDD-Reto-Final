package co.com.sofka.demo.Empleado.command;

import co.com.sofka.demo.Empleado.value.Funcion;
import co.com.sofka.demo.Empleado.value.IdEmpleado;
import co.com.sofka.demo.Empleado.value.IdGerente;
import co.com.sofka.domain.generic.Command;

public class ActualizarFuncionDeGerente extends Command {
    private final IdEmpleado idEmpleado;
    private final IdGerente idGerente;
    private final Funcion funcion;

    public ActualizarFuncionDeGerente(IdEmpleado idEmpleado, IdGerente idGerente, Funcion funcion) {
        this.idEmpleado = idEmpleado;
        this.idGerente = idGerente;
        this.funcion = funcion;
    }

    public IdEmpleado getIdEmpleado() {
        return idEmpleado;
    }

    public IdGerente getIdGerente() {
        return idGerente;
    }

    public Funcion getFuncion() {
        return funcion;
    }
}
