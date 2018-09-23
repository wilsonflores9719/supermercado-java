
package supermercado;

import java.util.ArrayList;

public class producto {
    private ArrayList <Integer>     CodigoProducto;
    private ArrayList <String>      NombreProducto;
    private ArrayList <Double>     PrecioProducto;
    private ArrayList <Integer>     StockProducto;
    
    //Constructor
    public producto() {
        this.CodigoProducto = new ArrayList();
        this.NombreProducto = new ArrayList();
        this.PrecioProducto = new ArrayList();
        this.StockProducto = new ArrayList();
    }

    public producto(ArrayList<Integer> CodigoProducto, ArrayList<String> NombreProducto, ArrayList<Double> PrecioProducto, ArrayList<Integer> StockProducto) {
        this.CodigoProducto = CodigoProducto;
        this.NombreProducto = NombreProducto;
        this.PrecioProducto = PrecioProducto;
        this.StockProducto = StockProducto;
    }
    
    //Asinacion de valores
    public void productos(){
        CodigoProducto.add(1);  NombreProducto.add("Pizza");        PrecioProducto.add(136.0);    StockProducto.add(35);
        CodigoProducto.add(2);  NombreProducto.add("Pan de Ajo");   PrecioProducto.add(60.0);     StockProducto.add(80);
        CodigoProducto.add(3);  NombreProducto.add("Calzone");      PrecioProducto.add(75.0);     StockProducto.add(25);
        CodigoProducto.add(4);  NombreProducto.add("Panini");       PrecioProducto.add(60.0);     StockProducto.add(30);
        CodigoProducto.add(5);  NombreProducto.add("Spagetti");     PrecioProducto.add(45.0);     StockProducto.add(15);
        CodigoProducto.add(7);  NombreProducto.add("Lassagna");     PrecioProducto.add(80.0);     StockProducto.add(40);
        CodigoProducto.add(8);  NombreProducto.add("Risotto");      PrecioProducto.add(85.0);     StockProducto.add(20);
        CodigoProducto.add(9);  NombreProducto.add("Baleadas");     PrecioProducto.add(70.0);     StockProducto.add(24);
    }
    //Getter
    
    //Metodo para obtener el nombre del producto
    public String getNombreProducto(int cod) {
        String getNombreProd="El Producto no Existe o esta fuera de stock";
        for (int i = 0; i < CodigoProducto.size(); i++) {
            if(cod==CodigoProducto.get(i)){
               getNombreProd=NombreProducto.get(i);
            }
        }
        return getNombreProd;
    }
    
    //Metodo para obtener el precio del producto
    public double getPrecioProducto(int cod) {
        double getPrecioProd=0;
        for (int i = 0; i < CodigoProducto.size(); i++) {
            if(cod==CodigoProducto.get(i)){
               getPrecioProd=PrecioProducto.get(i);
            }
        }
        return getPrecioProd;
    }

    //Metodo para obtener el Stock del producto
    public int getStockProducto(int cod) {
        int getStockProd=0;
        for (int i = 0; i < CodigoProducto.size(); i++) {
            if(cod==CodigoProducto.get(i)){
               getStockProd=StockProducto.get(i);
            }
        }
        return getStockProd;
    }
    
    
    
    //Setter
    
    public void setCodigoProducto(ArrayList<Integer> CodigoProducto) {
        this.CodigoProducto = CodigoProducto;
    }

    public void setNombreProducto(ArrayList<String> NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    public void setPrecioProducto(ArrayList<Double> PrecioProducto) {
        this.PrecioProducto = PrecioProducto;
    }

    public void setStockProducto(ArrayList<Integer> StockProducto) {
        this.StockProducto = StockProducto;
    }
    
    
    
    
}
