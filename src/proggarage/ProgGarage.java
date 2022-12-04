/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proggarage;

import java.util.Scanner;

/**
 *
 * @author gabriel.ricaldone
 */
public class ProgGarage {
    /*
    Si implementi una classe che modelli il garage sopradescritto offrendo le seguenti operazioni di gestione
        1] immissione di un nuovo veicolo
        2] estrazione dal garage del veicolo che occupa un determinato posto 
            (ritornare l'istanza del veicolo stesso)
        3] stampa della situazione corrente dei posti nel garage veicolo:
            proprietà: marca, anno, cilindrata; (per tutti)
            auto: porte, alimentazione (diesel/benzina)
    
    */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Throwable {
        // TODO code application logic here
        Garage garage = new Garage(15);
        garage.stampaGarage();
        
        
        
    }
    
    public static void inserimento() {
        Scanner in = new Scanner(System.in);
        int rispostaInt0,rispostaInt1,rispostaInt2,rispostaInt23;
        String rispostaString0,rispostaString1;
        String marca,alimentazione;
        int anno,cilindrata,porte,capacita,tempi;
        
        System.out.println("Cosa vorrebbe inserire? [1-Auto, 2-Camion, 3-Moto]");
        do {
            rispostaInt0 = in.nextInt();
            in.nextLine();
        } while(rispostaInt0 < 1 || rispostaInt0 > 3);
        switch(rispostaInt0) {
            case 1:
                //String marca, int anno, int cilindrata,int porte, String alimentazione
                //gasolio diesel
                System.out.println("Che marca è?");
                rispostaString0 = in.nextLine();
                System.out.println("Che cilindrata è?");
                rispostaInt1 = in.nextInt();
                System.out.println("Quante porte ha?");
                rispostaInt2 = in.nextInt();
                break;
            case 2:
                //String marca, int anno, int cilindrata, int capacita
                
                break;
            case 3:
                //String marca, int anno, int cilindrata,int tempi
                //2 o 4
                break;
        }
    }
    
}
