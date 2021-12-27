package co.com.sofka.demo.catalogo;

import co.com.sofka.demo.catalogo.values.*;
import co.com.sofka.domain.generic.Entity;

import java.util.List;

public class Empaquetado extends Entity<IdEmpaquetado> {
    private final Precio precio;
    private final Tamaño tamaño;
    private final Estado estado;
    public List<Articulo> ListaDeArticulos;

    public Empaquetado(IdEmpaquetado idEmpaquetado, Precio precio, Tamaño tamaño, Estado estado, List<Articulo> ListaDeArticulos){
        super(idEmpaquetado);
        this.precio = precio;
        this.tamaño = tamaño;
        this.estado = estado;
        this.ListaDeArticulos = ListaDeArticulos;
    }

    public void EditarPaquete(List<Articulo> ListaDeArticulos){
        this.ListaDeArticulos = ListaDeArticulos;
    }

    public void EliminarPaquete(IdEmpaquetado idEmpaquetado){
        ListaDeArticulos.removeIf(articulo -> articulo.identity().equals(idEmpaquetado));
    }
}
