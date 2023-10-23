/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;


public class Machine implements Serializable{
   
    
    private int id;
    private String marque;
    private double prix;
    private String ref;
    private Salle salle ;

    public Machine() {
    }

    public Machine(String marque, double prix, String ref, Salle salle) {
        this.marque = marque;
        this.prix = prix;
        this.ref = ref;
        this.salle=salle;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    @Override
    public String toString() {
        return "Machine{" + "id=" + id + ", marque=" + marque + ", prix=" + prix + ", ref=" + ref + '}';
    }
    
    
}
