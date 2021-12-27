package co.com.sofka.demo.catalogo.commands;

import co.com.sofka.demo.catalogo.Articulo;
import co.com.sofka.demo.catalogo.Empaquetado;
import co.com.sofka.domain.generic.Command;

import java.util.List;

public class EditarEmpaquetado extends Command {
    private final List<Articulo> ListaDeArticulos;
    private final Empaquetado paquete;

    public EditarEmpaquetado(List<Articulo> listaDeArticulos, Empaquetado paquete) {
        ListaDeArticulos = listaDeArticulos;
        this.paquete = paquete;
    }

    public List<Articulo> getListaDeArticulos() {
        return ListaDeArticulos;
    }

    public Empaquetado getPaquete() {
        return paquete;
    }
}
