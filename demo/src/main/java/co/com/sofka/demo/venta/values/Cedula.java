package co.com.sofka.demo.venta.values;
import co.com.sofka.domain.generic.ValueObject;
import java.util.Objects;

public final class Cedula implements ValueObject<Cedula.Properties> {
    private final int valor;

    public Cedula(int valor) {
        this.valor = valor;
        if (this.valor < 0) {
            throw new IllegalArgumentException("La cédula no tiene un valor válido");
        }
    }

    @Override
    public Properties value() {
        return new Properties() {
            @Override
            public int valor() {
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
        final Cedula other = (Cedula) obj;
        return Objects.equals(this.valor, other.valor);
    }

    public interface  Properties {
        int valor();
    }
}