
package supermercado;

import java.util.ArrayList;

public class factura {
    private String NombreCliente;
    private int edadCliente;
    private ArrayList <String>      NombreProducto;
    private ArrayList <Double>     PrecioProducto;
    private ArrayList <Integer>     cantidad;
    private double subtotal;
    private double descuento;
    private double isv;
    private double total;

    public factura() {
        this.NombreCliente = "";
        this.edadCliente = 0;
        this.NombreProducto = new ArrayList();
        this.PrecioProducto = new ArrayList();
        this.cantidad = new ArrayList();
        this.subtotal = 0;
        this.descuento = 0;
        this.isv = 0;
        this.total = 0;
    }
    
    public factura(String NombreCliente, int edadCliente, ArrayList<String> NombreProducto, ArrayList<Double> PrecioProducto, ArrayList<Integer> cantidad, double subtotal, double descuento, double isv, double total) {
        this.NombreCliente = NombreCliente;
        this.edadCliente = edadCliente;
        this.NombreProducto = NombreProducto;
        this.PrecioProducto = PrecioProducto;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.descuento = descuento;
        this.isv = isv;
        this.total = total;
    }
//Getter
    public String getNombreCliente() {
        return NombreCliente;
    }
    
    public int getEdadCliente() {
        return edadCliente;
    }

    public String getNombreProducto() {
        String output="";
        for (int i = 0; i < NombreProducto.size(); i++) {
            String Nombre=NombreProducto.get(i).toString();
            output=Nombre+" ";
        }
        return output;
    }

    public double getPrecioProducto() {
        double output=0;
        for (int i = 0; i < NombreProducto.size(); i++) {
            double precio=PrecioProducto.get(i);
            output=precio;
        }
        return output;
    }

    public Integer getCantidad() {
        int output=0;
        for (int i = 0; i < NombreProducto.size(); i++) {
            int cant=cantidad.get(i);
            output=cant;
        }
        return output;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getDescuento() {
        return descuento;
    }

    public double getIsv() {
        return isv;
    }

    public double getTotal() {
        return total;
    }
    
//Setter

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public void setEdadCliente(int edadCliente) {
        this.edadCliente = edadCliente;
    }

    public void setNombreProducto(ArrayList<String> NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    public void setPrecioProducto(ArrayList<Double> PrecioProducto) {
        this.PrecioProducto = PrecioProducto;
    }

    public void setCantidad(ArrayList<Integer> cantidad) {
        this.cantidad = cantidad;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public void setIsv(double isv) {
        this.isv = isv;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    
    
    
}
