package co.com.sofka.demo.catalogo;

import co.com.sofka.demo.catalogo.events.*;
import co.com.sofka.demo.catalogo.values.*;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.List;
import java.util.Optional;

public class Catalogo extends AggregateEvent<IdCatalogo> {

    protected IdStock idStock;
    protected List<Articulo> ListaDeArticulos;
    protected List<Empaquetado> ListaDePaquetes;
    protected IdEmpaquetado idEmpaquetado;


    public Catalogo(IdCatalogo idCatalogo, IdStock idStock, List<Articulo> listaDeArticulos,List<Empaquetado> ListaDePaquetes, IdEmpaquetado idEmpaquetado) {
        super(idCatalogo);
        this.idStock = idStock;
        this.ListaDeArticulos = listaDeArticulos;
        this.ListaDePaquetes = ListaDePaquetes;
        this.idEmpaquetado = idEmpaquetado;
    }

    public void ActualizarCatalogo(List<Articulo> ListaDeArticulos){
        this.ListaDeArticulos = ListaDeArticulos;
        appendChange((new ActualizarCatalogo(ListaDeArticulos))).apply();
    }
    public void AñadirNuevoPaquete(List<Empaquetado> ListaDePaquetes){
        this.ListaDePaquetes = ListaDePaquetes;
        appendChange((new ActualizarEmpaquetado(ListaDePaquetes))).apply();
    }

    public Optional<Articulo> SeleccionarUnArticulo(IdArticulo idArticulo){
        var Lista = ListaDeArticulos.stream().filter(
                (articulo) -> {
                    return articulo.SeleccionarArticulo(idArticulo);
                }
        );
        if(Lista.findAny().isPresent()){
            appendChange((new ArticuloSeleccionado(idArticulo))).apply();
            return Lista.findFirst();
        }return null;
    }

    public void EliminarUnArticulo(IdArticulo idArticulo){
        ListaDeArticulos.removeIf(articulo -> articulo.identity().equals(idArticulo));
        appendChange((new EliminarArticulo(idArticulo))).apply();
    }

    public void VaciarArticulo(IdArticulo idArticulo){
        SeleccionarUnArticulo(idArticulo).get().disponibilidad().valor = "Sin Stock";
        appendChange((new VaciarStock(idArticulo))).apply();
    }


    public void EliminarDelCatalogo(IdEmpaquetado idEmpaquetado){
        ListaDePaquetes.removeIf(paquete -> paquete.identity().equals(idEmpaquetado));
        appendChange((new EliminarPaquete(idEmpaquetado))).apply();
    }
    public void EditarPaquete(List<Articulo> ListaDeArticulos, Empaquetado paquete){
        paquete.ListaDeArticulos = ListaDeArticulos;
        appendChange((new EditarEmpaquetado(paquete.identity(),ListaDeArticulos))).apply();
    }

    public String ConsultarArticulo(IdArticulo idArticulo){
        var stock = SeleccionarUnArticulo(idArticulo).get().disponibilidad().getValor();
        appendChange((new ConsultarStock(idArticulo))).apply();
        return "El Stock de este articulo es "+stock;
    }

    

    public IdStock getIdStock() {
        return idStock;
    }

    public List<Articulo> getListaDeArticulos() {
        return ListaDeArticulos;
    }

    public List<Empaquetado> getListaDePaquetes() {
        return ListaDePaquetes;
    }

    public IdEmpaquetado getidEmpaquetado() {
        return idEmpaquetado;
    }
}
