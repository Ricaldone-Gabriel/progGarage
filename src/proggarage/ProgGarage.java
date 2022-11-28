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
public class ProgGarage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Throwable {
        // TODO code application logic here
        Garage garage = new Garage(15);
        garage.inserisci(new Camion("Tesla",2037,10,10));
        garage.inserisci(new Camion("Tesla1",2037,10,10));
        garage.inserisci(new Camion("Tesla2",2037,10,10));
        garage.inserisci(new Camion("Tesla3",2037,10,10));
        System.out.println(garage.rimuovi(2));
        garage.inserisci(new Camion("Tesla4",2037,10,10));
        System.out.println(garage.rimuovi(2));
    }
    
}
