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
