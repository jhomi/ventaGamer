package pe.edu.upeu.modelo;

import lombok.Data;

@Data

public class DetalleVentaTO {
    public String idDetalle, idVenta, idProducto; 
    public String cantidad , precioUnit, descuento, total; 
}
