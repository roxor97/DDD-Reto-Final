package co.com.sofka.demo.catalogo.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class Precio implements ValueObject<Precio.Properties> {
    private final Double valor;

    public Precio(Double valor) {
        this.valor = Objects.requireNonNull(valor, "El precio es requerido");
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
        final Precio precio = (Precio) obj;
        return Objects.equals(this.valor, precio.valor);
    }

    public interface  Properties {
        Double valor();
    }
}