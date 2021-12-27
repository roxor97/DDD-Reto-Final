package co.com.sofka.demo.catalogo.commands;

import co.com.sofka.demo.catalogo.Empaquetado;
import co.com.sofka.domain.generic.Command;

import java.util.List;

public class AgregarEmpaquetado extends Command {
    private final List<Empaquetado> ListaDePaquetes;

    public AgregarEmpaquetado(List<Empaquetado> listaDePaquetes) {
        ListaDePaquetes = listaDePaquetes;
    }

    public List<Empaquetado> getListaDePaquetes() {
        return ListaDePaquetes;
    }
}
