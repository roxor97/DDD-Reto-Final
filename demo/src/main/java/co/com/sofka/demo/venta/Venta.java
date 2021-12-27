package co.com.sofka.demo.venta;
import co.com.sofka.demo.venta.events.*;
import co.com.sofka.demo.venta.values.*;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.List;
import java.util.Objects;

public class Venta extends AggregateEvent<IdVenta> {

    private final IdCliente IdCliente;
    private final List<Producto> ListaDeProductos;
    private final Precio precio;

    public Venta(IdVenta IdVenta, IdCliente Idcliente, List<Producto> ListaDeProductos, Precio precio){
        super(IdVenta);
        this.IdCliente = Objects.requireNonNull(Idcliente);
        this.ListaDeProductos = ListaDeProductos;
        this.precio = Objects.requireNonNull(precio);
    }

    public void Generarfactura(){
        appendChange(new FacturaGenerado(IdCliente,precio)).apply();
    }

    public void EditarPrecioDeUnProducto(IdProducto idProducto,Precio precio){
        ListaDeProductos.forEach(item ->{
            item.editarPrecio(precio);
            appendChange(new PrecioDeProductoEditado(idProducto, precio));
        });
    }

    public void BorrarUnProducto(IdProducto idProducto){
        ListaDeProductos.removeIf(item -> item.identity().equals(idProducto));
        appendChange(new ProductoBorrado(idProducto)).apply();
    }

    public void AgregarUnProducto(IdProducto idProducto, Precio precio, Factura factura){
        var id = new IdProducto();
        ListaDeProductos.add(new Producto(id,precio,factura));
        appendChange(new ProductoAgregado(id,precio,factura)).apply();
    }

    public void PonerOrdenDeUnCliente(Cliente cliente, Orden orden){
        cliente.ListaDeOrdenes.add(orden);
        appendChange(new OrdenDeUnClientePuesta(orden.identity())).apply();
    }

    public void CancelarOrdenDeUnCliente(Cliente cliente, IdOrden idOrden){
        cliente.ListaDeOrdenes.removeIf(item -> item.identity().equals(idOrden));
        appendChange(new OrdenDeUnClienteCancelada(idOrden)).apply();
    }

    public IdCliente idCliente() {
        return IdCliente;
    }

    public List<Producto> listaDeProductos() {
        return ListaDeProductos;
    }

    public Precio Precio() {
        return precio;
    }
}
