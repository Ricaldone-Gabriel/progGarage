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
public class Moto extends Veicoli{
    private int tempi; //Movimenti che fa il pistone che sono solo 2 o 4
    
    Moto(String marca, int anno, int cilindrata,int tempi) {
        super(marca,anno,cilindrata);
        this.tempi = tempi;
        if (tempi < 0) {
            System.out.println("Tempi diverso da 2 o 4, possibili errori");
        }
    }
    
    public int getTempi() {
        return tempi;
    }
    
    @Override
    public String toString() {
        String output;
        
        output = super.toString();
        output += "\nTempi: " + tempi;
        
        return output;
    }
}
