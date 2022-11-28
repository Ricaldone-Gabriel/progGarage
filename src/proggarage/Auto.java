/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proggarage;

/**
 *
 * @author gabriel.ricaldone
 */
public class Auto extends Veicoli{
    int porte;
    String alimentazione;
    //Diesel / Gasolio
    Auto(String marca, int anno, int cilindrata,int porte, String alimentazione) {
        super(marca,anno,cilindrata);
        this.porte = porte;
        if (porte < 0) {
            System.out.println("Porte minore di 0, possibili errori");
        }
        this.alimentazione = alimentazione.toLowerCase();
        if (!(alimentazione.equals("gasolio") || alimentazione.equals("diesel"))) {
            System.out.println("L'alimentazione non è [Gasolio] o [Diesel], possibili errori");
        }
    }    
    
    public int getPorte() {
        return porte;
    }
    
    public String getAlimentazione() {
        return alimentazione;
    }
    
    @Override
    public String toString() {
        String output;
        
        output = super.toString();
        output += "\nPorte: " + porte +
                  "\nAlimentazione: " + alimentazione;
        
        return output;
    }
}
