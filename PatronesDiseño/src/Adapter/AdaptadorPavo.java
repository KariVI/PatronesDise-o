/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

public class AdaptadorPavo implements Pato{
        private Pavo pavo;
               
	public AdaptadorPavo(Pavo pavo){     	
                this.pavo=pavo;
        }
        
        public void graznar() {
            pavo.gluglutear();
        }
        
        public void volar() {
            pavo.volar();
        }
}

