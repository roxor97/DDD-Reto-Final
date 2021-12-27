package co.com.sofka.demo.venta.events;

import co.com.sofka.demo.venta.values.IdOrden;
import co.com.sofka.domain.generic.*;

import java.util.Objects;

public class OrdenDeUnClienteCancelada extends DomainEvent {
    private final IdOrden idOrden;
    public OrdenDeUnClienteCancelada(IdOrden idOrden){
        super("OrdenDeUnClienteCancelada");
        this.idOrden = Objects.requireNonNull(idOrden);
    }

    public IdOrden getIdOrden(){
        return this.idOrden;
    }
}
