/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp2systemgestionetudiant;

/**
 *
 * @author LENOVO
 */
public class Etudiant {
    private String nom;
    private String prenom;
    private int ns ;
    private String email;
    
    
    public Etudiant(String nom,String prenom,int ns,String email){
        this.nom= nom;
        this.prenom= prenom;
        this.ns=ns;
        this.email=email;
        
    }
    public String getNom(){
        return this.nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getNs() {
        return ns;
    }

    public String getEmail() {
        return email;
    }
    public void setNom(String Nom){
        this.nom=Nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNs(int ns) {
        this.ns = ns;
    }

    public void setEmail(String email) {
        this.email = email;
    }

  public void ToString(){
      System.out.println("nom="+this.nom+" , prenom= "+this.prenom+" , nombre d'inscription="+this.ns+" , email="+this.email);
  }
    
    
    
}
