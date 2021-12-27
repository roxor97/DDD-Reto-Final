package co.com.sofka.demo.catalogo.values;

import co.com.sofka.domain.generic.ValueObject;

public class Tamaño implements ValueObject<Integer>{
    public final int valor;

    public Tamaño(int valor){
        this.valor = valor;
    }

    @Override
    public Integer value() {
        return valor;
    }
}
