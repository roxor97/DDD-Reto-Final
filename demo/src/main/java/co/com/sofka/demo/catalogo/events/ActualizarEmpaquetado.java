package co.com.sofka.demo.catalogo.events;

import co.com.sofka.demo.catalogo.Empaquetado;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;

public class ActualizarEmpaquetado extends DomainEvent {
    private final List<Empaquetado> ListaDePaquetes;

    public ActualizarEmpaquetado(List<Empaquetado> ListaDePaquetes){
        super("ActualizarEmpaquetado");
        this.ListaDePaquetes = ListaDePaquetes;
    }

    public List<Empaquetado> getListaDePaquetes(){
        return this.ListaDePaquetes;
    }

}
