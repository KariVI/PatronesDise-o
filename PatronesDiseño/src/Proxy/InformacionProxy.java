/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

public class InformacionProxy implements Informacion{
    private InformacionReal informacionReal;
    private String codigo;
    
    public InformacionProxy(String codigo){
        this.codigo = codigo;
    }
 
    public void mostrarInformacion() {      
        if(codigo.equalsIgnoreCase("administrador")){
            System.out.println("¡¡Accedido con éxito!!");
            informacionReal = new InformacionReal(); 
            informacionReal.mostrarInformacion();
        }else{
            System.out.println("No tiene permisos para acceder.");
        }          
    }
}

