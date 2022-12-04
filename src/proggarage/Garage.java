/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proggarage;

/**
 * 3] stampa della situazione corrente dei posti nel garage veicolo:
            proprietà: marca, anno, cilindrata; (per tutti)
            auto: porte, alimentazione (diesel/benzina)
    
 * @author gabriel.ricaldone
 */
public class Garage {
    private Auto[] postiAuto;
    private Camion[] postiCamion;
    private Moto[] postiMoto;
    private int posti;
    
    Garage(int posti) {
        this.posti = posti;
        postiAuto = new Auto[posti];
        postiCamion = new Camion[posti];
        postiMoto = new Moto[posti];
    }
    
    public void stampaGarage() {
        for (int i = 0; i < posti; i++) {
            if(postiAuto[i] != null) {
                System.out.println("Posto n" + i + ":\n" + postiAuto[i].toString() + "\n");
            }
            else if(postiCamion[i] != null) {
                System.out.println("Posto n" + i + ":\n" + postiCamion[i].toString()+ "\n");
            }
            else if(postiMoto[i] != null) {
                System.out.println("Posto n" + i + ":\n" + postiMoto[i].toString()+ "\n");
            } else {
                System.out.println("Posto n" + i + ": vuoto \n");
            }
        } 
    }
    
    public void inserisci(Auto auto) {
        boolean trov = false;
        for (int i = 0; i < posti && !trov; i++) {
            if (postiAuto[i] == null && postiCamion[i] == null && postiMoto[i] == null) {
                postiAuto[i] = auto;
                trov = true;
            }
        }       
    }
    
    public void inserisci(Camion camion) {
        boolean trov = false;
        for (int i = 0; i < posti && !trov; i++) {
            if (postiAuto[i] == null && postiCamion[i] == null && postiMoto[i] == null) {
                postiCamion[i] = camion;
                trov = true;
            }
        }  
    }
    
    public void inserisci(Moto moto) {
        boolean trov = false;
        for (int i = 0; i < posti && !trov; i++) {
            if (postiAuto[i] == null && postiCamion[i] == null && postiMoto[i] == null) {
                postiMoto[i] = moto;
                trov = true;
            }
        }  
    }
    
    public String rimuovi(int posto) throws Throwable {
        String output;
        
        if (postiAuto[posto] != null) {
            output = postiAuto[posto].getMarca() + " " + postiAuto[posto].getAnno() 
                    + " " + postiAuto[posto].getCilindrata() + " " + postiAuto[posto].getPorte() 
                    + " " + postiAuto[posto].getAlimentazione();
            postiAuto[posto].elimina();
            postiAuto[posto] = null;
            return output;
        }
        
        if (postiCamion[posto] != null) {
            output = postiCamion[posto].getMarca() + " " + postiCamion[posto].getAnno() 
                    + " " + postiCamion[posto].getCilindrata() + " " + postiCamion[posto].getCapacita();
            postiCamion[posto].elimina();
            postiCamion[posto] = null;
            return output;
        }
        
        if (postiMoto[posto] != null) {
            output = postiMoto[posto].getMarca() + " " + postiMoto[posto].getAnno() 
                    + " " + postiMoto[posto].getCilindrata() + " " + postiMoto[posto].getTempi();
            postiMoto[posto].elimina();
            postiMoto[posto] = null;
            return output;
        }
        return "null";
    }
    
}
