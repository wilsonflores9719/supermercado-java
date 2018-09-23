
package supermercado;

import java.util.ArrayList;

public class clientes {
 private ArrayList <Integer> CodigoCliente;
 private ArrayList <String> NombreCliente;
 private ArrayList <Integer> EdadCliente;
 private double descuento;   
 //Contructor
    public clientes() {
        this.CodigoCliente = new ArrayList();
        this.NombreCliente = new ArrayList();
        this.EdadCliente = new ArrayList();
        this.descuento=0;
    }
    
    public clientes(ArrayList<Integer> CodigoCliente, ArrayList<String> NombreCliente, ArrayList<Integer> EdadCliente, double descuento) {
        this.CodigoCliente = CodigoCliente;
        this.NombreCliente = NombreCliente;
        this.EdadCliente = EdadCliente;
        this.descuento=descuento;
    }
    //Asinacion de valores a los ArrayList
    public void cliente(){
        CodigoCliente.add(0);   NombreCliente.add("Cliente varios");     EdadCliente.add(0);
        CodigoCliente.add(1);   NombreCliente.add("Besly");              EdadCliente.add(20);
        CodigoCliente.add(2);   NombreCliente.add("Wilson");             EdadCliente.add(21);
        CodigoCliente.add(3);   NombreCliente.add("Kalel");              EdadCliente.add(22);
        CodigoCliente.add(4);   NombreCliente.add("Kenai");              EdadCliente.add(54);
        CodigoCliente.add(5);   NombreCliente.add("Angi");               EdadCliente.add(24);
    }

    //Getter
    //Metodo para Obtener el nombre del cliente
    public String getNombreCliente(int cod) {
        String getNombre="El cliente no Existe";
        for (int i = 0; i < CodigoCliente.size(); i++) {
            if(cod==CodigoCliente.get(i)){
               getNombre=NombreCliente.get(i);
            }
        }
        return getNombre;
    }
    //Metodo para obtener la edad del cliente
    public int getEdadCliente(int cod) {
        int getEdad=0;
        for (int i = 0; i < CodigoCliente.size(); i++) {
            if(cod==CodigoCliente.get(i)){
               getEdad=EdadCliente.get(i);
            }
        }
        return getEdad;
    }

    public double getDescuento(int cod) {
        double getDesc=0.0;
        for (int i = 0; i < CodigoCliente.size(); i++) {
            if(cod==CodigoCliente.get(i)){
               getDesc=0.10;
            }
        }
        return getDesc;
    }
    
    

    //Setter
    
    public void setCodigoCliente(ArrayList<Integer> CodigoCliente) {
        this.CodigoCliente = CodigoCliente;
    }

    public void setNombreCliente(ArrayList<String> NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public void setEdadCliente(ArrayList<Integer> EdadCliente) {
        this.EdadCliente = EdadCliente;
    }
    
    
    
    
    
 
 
 
}
