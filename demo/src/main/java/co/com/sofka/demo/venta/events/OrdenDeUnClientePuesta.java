package co.com.sofka.demo.venta.events;

import co.com.sofka.demo.venta.values.IdOrden;
import co.com.sofka.domain.generic.*;

public class OrdenDeUnClientePuesta extends DomainEvent {
    private IdOrden idOrden;

    public OrdenDeUnClientePuesta(IdOrden idOrden) {
        super("OrdenDeUnClientePuesta");
        this.idOrden = idOrden;
    }

    public IdOrden getidOrden() {
        return idOrden;
    }
}
