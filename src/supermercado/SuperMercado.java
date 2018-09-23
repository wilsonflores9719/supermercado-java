
package supermercado;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SuperMercado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Parametros que seran enviados a la clase factura
        ArrayList <String> NombreProducto=new ArrayList();
        ArrayList <Double> PrecioProducto=new ArrayList();
        ArrayList <Integer> CantidadProducto=new ArrayList();
        //Llamado de objetos
        clientes client=new clientes();
        producto prod=new producto();
        factura compra[] =new factura[2];
        //Variables
        String opcion,codCliente,codProducto,NombreCliente,resp,cant;
        int opc,codC,codP,EdadCliente,cantidad;
        double subtotal=0.0,descuento=0.0,total=0,terceraedad=0.05,isv=0.15;
        double acumV=0;
        //Llenamos los ArrayList
        client.cliente();
        prod.productos();
        do{
            //Pedimos al cliente una opcion
            opcion=JOptionPane.showInputDialog(null, "MENU \n 1. Facturar \n 2. Venta diaria \n 3.Factura por cliente \n 4.Salir");
            //Convertimos la opcion de String a entero
            opc=Integer.parseInt(opcion); 
            
            switch(opc){
                case 1:
                    for (int i = 0; i < 1; i++) {
                        //Cliente
                        //Solicitamos el codigo del cliente
                        codCliente=JOptionPane.showInputDialog(null, "Ingrese Codigo de Cliente");
                        codC=Integer.parseInt(codCliente);
                        //Obtenemos el codigo del cliente
                        NombreCliente=client.getNombreCliente(codC);
                        EdadCliente=client.getEdadCliente(codC);
                        //Producto
                        resp=JOptionPane.showInputDialog(null, "Desea empezar a agregar productos");
                        //resp=resp.toUpperCase();
                        while(resp.equals("si")){
                            //Solicitamos el codigo de Producto
                            codProducto=JOptionPane.showInputDialog(null, "Ingrese codigo de Producto");
                            codP=Integer.parseInt(codProducto);
                            //Llenamos las variables
                            NombreProducto.add(prod.getNombreProducto(codP));
                            PrecioProducto.add(prod.getPrecioProducto(codP));
                            cant=JOptionPane.showInputDialog(null, "Ingrese Cantidad");
                            cantidad=Integer.parseInt(cant);
                            CantidadProducto.add(cantidad);
                            subtotal=subtotal+(cantidad*(prod.getPrecioProducto(codP)));
                            
                            resp=JOptionPane.showInputDialog(null, "Desea empezar a agregar productos");
                            //resp=resp.toUpperCase();
                        }
                        
                        //Calculo
                        if(NombreCliente!="El cliente no Existe"){
                            descuento=0.07;
                            double t=(subtotal*descuento);
                            double im=((subtotal-t)*isv);
                            total=subtotal-t+im;
                        }
                        if (NombreCliente!="El cliente no Existe" && EdadCliente>45){
                            double t=(subtotal*descuento);
                            double im=((subtotal-t)*isv);
                            double desc=subtotal*descuento;
                            total=subtotal-desc-t+im;
                        }
                        
                        //Lenado del Arreglo compra de tipo factura
                        compra[i]=new factura(NombreCliente,EdadCliente,NombreProducto,PrecioProducto,CantidadProducto,subtotal,descuento,isv,total);
                        //Factura
                        JOptionPane.showMessageDialog(null, "Su Factura \n Nombre: "+compra[i].getNombreCliente()+
                            "\n Edad: "+compra[i].getEdadCliente()+
                            "\n NombreProducto: "+compra[i].getNombreProducto()+
                            "\n Precio: "+compra[i].getPrecioProducto()+
                            "\n Cant: "+compra[i].getCantidad()+
                            "\n SubTotal: "+compra[i].getSubtotal()+
                            "\n Descuento: "+compra[i].getDescuento()+
                            "\n isv: "+compra[i].getIsv()+
                            "\n Total: "+compra[i].getTotal());
                        acumV=acumV+total;
                    }
                    //Pedimos al cliente una opcion
                    opcion=JOptionPane.showInputDialog(null, "MENU \n 1. Facturar \n 2. Venta diaria \n 3.Factura por cliente \n 4.Salir");
                    //Convertimos la opcion de String a entero
                    opc=Integer.parseInt(opcion);
                case 2:
                    JOptionPane.showMessageDialog(null, "Ventas del día Lps. "+acumV);
                    //Pedimos al cliente una opcion
                    opcion=JOptionPane.showInputDialog(null, "MENU \n 1. Facturar \n 2. Venta diaria \n 3.Factura por cliente \n 4.Salir");
                    //Convertimos la opcion de String a entero
                    opc=Integer.parseInt(opcion);
                    break;
                case 3:
                    //Factura por Cliente
                    String NameClient=JOptionPane.showInputDialog(null, "Ingrese Nombre de Cliente");
                     for (int i = 0; i < compra.length; i++) {
                        String name=compra[i].getNombreCliente();
                            if(name.equalsIgnoreCase(NameClient)){
                            JOptionPane.showMessageDialog(null, "Su Factura \n Nombre: "+compra[i].getNombreCliente()+
                            "\n Edad: "+compra[i].getEdadCliente()+
                            "\n NombreProducto: "+compra[i].getNombreProducto()+
                            "\n Precio: "+compra[i].getPrecioProducto()+
                            "\n Cant: "+compra[i].getCantidad()+
                            "\n SubTotal: "+compra[i].getSubtotal()+
                            "\n Descuento: "+compra[i].getDescuento()+
                            "\n isv: "+compra[i].getIsv()+
                            "\n Total: "+compra[i].getTotal());
                            }
                    }
                    break;
            }
        }while(opc<4);
        
    }

    

    
}
