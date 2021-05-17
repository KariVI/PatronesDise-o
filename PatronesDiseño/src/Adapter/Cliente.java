
package Adapter;

public class Cliente {
    
     public static void main(String[] args) {
        PatoMallard patoMallard = new PatoMallard();
        Pavo pavo = new Pavo();
        Pato pavoAdaptado = new AdaptadorPavo(pavo);
 
        System.out.println("El pato hace ");
        patoMallard.graznar();
        patoMallard.volar();
        
        System.out.println("El pavo hace ");
        pavo.gluglutear();
        pavoAdaptado.volar();
        
        System.out.println("El pavo adaptado como pato hace ");
        pavoAdaptado.graznar();
        pavoAdaptado.volar();
        
        
    }

}