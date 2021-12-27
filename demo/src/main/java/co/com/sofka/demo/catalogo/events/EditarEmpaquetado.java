package co.com.sofka.demo.catalogo.events;

import co.com.sofka.demo.catalogo.Articulo;
import co.com.sofka.demo.catalogo.values.IdEmpaquetado;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;

public class EditarEmpaquetado extends DomainEvent {
    private final IdEmpaquetado idEmpaquetado;
    private final List<Articulo> ListaDeArticulos;
    public EditarEmpaquetado(IdEmpaquetado idEmpaquetado, List<Articulo> ListaDeArticulos){
        super("EditarEmpaquetado");
        this.idEmpaquetado = idEmpaquetado;
        this.ListaDeArticulos = Objects.requireNonNull(ListaDeArticulos);
    }

    public List<Articulo> getListaDeArticulos(){
        return this.ListaDeArticulos;
    }
}
