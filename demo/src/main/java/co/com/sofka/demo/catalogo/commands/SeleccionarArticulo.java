package co.com.sofka.demo.catalogo.commands;

import co.com.sofka.demo.catalogo.values.IdArticulo;
import co.com.sofka.domain.generic.Command;

public class SeleccionarArticulo extends Command {
    private final IdArticulo idArticulo;

    public SeleccionarArticulo(IdArticulo idArticulo) {
        this.idArticulo = idArticulo;
    }

    public IdArticulo getIdArticulo() {
        return idArticulo;
    }
}
