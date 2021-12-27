package co.com.sofka.demo.Empleado.value;

import co.com.sofka.domain.generic.ValueObject;
import java.util.Objects;

public class Funcion implements ValueObject<String> {
    private final String value;

    public Funcion(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("La funcion no puede estar vacia");
        }
        if (this.value.length() <= 5){
            throw new IllegalArgumentException("Debes de tener mas de 5 caracteres");
        }
        if (this.value.length() >= 180){
            throw new IllegalArgumentException("Debe ser menor a 50 caracteres");
        }
    }

    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Funcion funcion = (Funcion) obj;
        return Objects.equals(this.value, funcion.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
