package co.com.sofka.demo.Empleado.command;

import co.com.sofka.demo.Empleado.value.Funcion;
import co.com.sofka.demo.Empleado.value.IdEmpleado;
import co.com.sofka.demo.Empleado.value.IdVendedor;
import co.com.sofka.domain.generic.Command;

public class ActualizarFuncionDeVendedor extends Command {
    private final IdEmpleado idEmpleado;
    private final IdVendedor idVendedor;
    private final Funcion funcion;

    public ActualizarFuncionDeVendedor(IdEmpleado idEmpleado, IdVendedor idVendedor, Funcion funcion) {
        this.idEmpleado = idEmpleado;
        this.idVendedor = idVendedor;
        this.funcion = funcion;
    }

    public IdEmpleado getIdEmpleado() {
        return idEmpleado;
    }

    public IdVendedor getIdVendedor() {
        return idVendedor;
    }

    public Funcion getFuncion() {
        return funcion;
    }
}
