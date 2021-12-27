package co.com.sofka.demo.catalogo.events;

import co.com.sofka.demo.catalogo.Articulo;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;

public class ActualizarCatalogo extends DomainEvent {
    private final List<Articulo> ListaDeArticulos;

    public ActualizarCatalogo(List<Articulo> ListaDeArticulos){
        super("ActualizarCatalogo");
        this.ListaDeArticulos = ListaDeArticulos;
    }

    public List<Articulo> getListaDeArticulos(){
        return this.ListaDeArticulos;
    }

}
