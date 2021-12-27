package co.com.sofka.demo.venta.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class EstadoOrden implements ValueObject<EstadoOrden.Properties> {
    public String state;

    public EstadoOrden(Double valor) {
        this.state = Objects.requireNonNull(state, "El estado de la orden no puede ser null");
    }

    @Override
    public Properties value() {
        return new Properties() {
            @Override
            public String state() {
                return state;
            }
        };
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final EstadoOrden other = (EstadoOrden) obj;
        return Objects.equals(this.state, other.state);
    }

    public interface  Properties {
        String state();
    }
}