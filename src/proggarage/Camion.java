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
public class Camion extends Veicoli {
    private int capacita;
    
    Camion(String marca, int anno, int cilindrata, int capacita) {
        super(marca,anno,cilindrata);
        this.capacita = capacita;
        if (capacita < 0) {
            System.out.println("Capacità minore di 0, possibili errori");
        }
    }
    
    public int getCapacita() {
        return capacita;
    }
    
    @Override
    public String toString() {
        String output;
        
        output = super.toString();
        output += "\nCapacità: " + capacita;
        
        return output;
    }
}
