package co.com.sofka.demo.catalogo.commands;

import co.com.sofka.demo.catalogo.values.IdEmpaquetado;
import co.com.sofka.domain.generic.Command;

public class EliminarEmpaquetado extends Command {
    private final IdEmpaquetado idPaquete;

    public EliminarEmpaquetado(IdEmpaquetado idPaquete) {
        this.idPaquete = idPaquete;
    }

    public IdEmpaquetado getIdPaquete() {
        return idPaquete;
    }
}
