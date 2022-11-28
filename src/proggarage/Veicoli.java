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

//Ridefinire il metodo toString in modo che ogni entità possa esternalizzare
//in forma di stringa tutte le informazioni che la riguardano.
public class Veicoli {
    protected String marca;
    protected int anno;
    protected int cilindrata;
    
    Veicoli(String marca, int anno, int cilindrata) {
        this.marca = marca;
        this.anno = anno;
        this.cilindrata = cilindrata;
        if (cilindrata < 0) {
            System.out.println("Cilindrata minore di 0, possibili errori");
        }
    }
    
    public String getMarca() {
        return marca;
    }
    
    public int getAnno() {
        return anno;
    }
    
    public int getCilindrata() {
        return cilindrata;
    }
    
    @Override
    public String toString() {
        String output;
        
        output = "Marca: " + marca +
               "\nAnno: " + anno +
               "\nCilindrata: " + cilindrata;
        
        return output;
    }
    
    protected void elimina() throws Throwable {
        super.finalize();
    }
}
