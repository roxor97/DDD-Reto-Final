package co.com.sofka.demo.catalogo.events;

import co.com.sofka.demo.catalogo.values.IdEmpaquetado;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.Objects;

public class EliminarPaquete extends DomainEvent {
    private final IdEmpaquetado idEmpaquetado;

    public EliminarPaquete(IdEmpaquetado idEmpaquetado){
        super("EliminarPaquete");
        this.idEmpaquetado = Objects.requireNonNull(idEmpaquetado);
    }

    public IdEmpaquetado getidEmpaquetado(){
        return this.idEmpaquetado;
    }
}
