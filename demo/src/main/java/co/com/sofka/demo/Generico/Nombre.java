package co.com.sofka.demo.Generico;

import co.com.sofka.domain.generic.ValueObject;
import java.util.Objects;

public class Nombre implements ValueObject<String> {
    private final String value;

    public Nombre(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }
        if (this.value.length() <= 5){
            throw new IllegalArgumentException("Debes de tener mayor a 5 caracteres");
        }

        if (this.value.length() >= 80){
            throw new IllegalArgumentException("Debe ser menor a 50 caracteres");
        }
    }

    public String value() {
        return null;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Nombre nombre = (Nombre) obj;
        return Objects.equals(this.value, nombre.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
