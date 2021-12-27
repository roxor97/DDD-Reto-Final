package co.com.sofka.demo.venta.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class Factura implements ValueObject<Factura.Properties> {
    private final Double valor;

    public Factura(Double valor) {
        this.valor = Objects.requireNonNull(valor, "El valor total es requerido");
        if (this.valor < 0) {
            throw new IllegalArgumentException("El valor no puede ser cero o negativo");
        }
    }

    @Override
    public Properties value() {
        return new Properties() {
            @Override
            public Double valor() {
                return valor;
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
        final Factura other = (Factura) obj;
        return Objects.equals(this.valor, other.valor);
    }

    public interface  Properties {
        Double valor();
    }
}
