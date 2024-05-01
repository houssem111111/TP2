/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp2systemgestionetudiant;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class SystemGestionEtudiant {
    private ArrayList<Etudiant> List ;
    public  SystemGestionEtudiant(){
        this.List = new ArrayList();
    }
    public void ajouterEtudiant(String nom,String prenom, int ns,String email){
        Etudiant e = new Etudiant (nom,prenom,ns,email);
        List.add(e);
        
    }
    public void afficherEtudiant(){
        for (Etudiant e : List){
            e.ToString();
        }
    }
    public void modiferEmailEtudiant(int na ,String nouveauEmail){
        for (Etudiant e : List ){
            if (e.getNs()== na) {
            e.setEmail(nouveauEmail)   ;
           }
        }
     }
    public void supprimerEtudiant(int numeroInscription){
        for (int i=0; i<List.size();i++){
            if (this.List.get(i).getNs()==numeroInscription ){
                List.remove(i);
            }
        }
    }
    
}