package co.com.sofka.demo.catalogo.events;

import co.com.sofka.demo.catalogo.values.IdArticulo;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.Objects;

public class ConsultarStock extends DomainEvent {
    private final IdArticulo idArticulo;

    public ConsultarStock(IdArticulo idArticulo){
        super("ConsultarStock");
        this.idArticulo = Objects.requireNonNull(idArticulo);
    }


    public IdArticulo getIdArticulo(){
        return this.idArticulo;
    }
}
