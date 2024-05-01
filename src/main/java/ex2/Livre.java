/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2;

/**
 *
 * @author houssem
 */
    
public class Livre {
   private String titre ;
   private String auteur;
   public String annee ;
   public String isbn ;
   
   public Livre (){
        this.titre="hunter";
        this.auteur = "hoss" ;
        this.annee = "2002";
        this.isbn = "0";
   }
   public String getTitre(){
       return this.titre ;
   }
   public void setTitre(String titre){
       this.titre=titre;
   }
   public String getAuteur (){
       return this.auteur;
   }
   public void setAuteur (String auteur){
       this.auteur=auteur;
   }
   public Livre (String titre, String auteur ){
       this.titre = titre;
       this.auteur = auteur ;       
       this.annee = "200" ; 
       this.isbn = "8" ;
   }
   public Livre (String titre, String auteur , String annee ){
        this.titre=titre;
        this.auteur = auteur ;
        this.annee = annee;
        this.isbn = "88" ;
   }
   public Livre (String titre , String auteur, String annee , String isbn ){
       this.titre=titre;
       this.annee=annee;
       this.auteur=auteur;
       this.isbn=isbn;
   }
   public void afficher (){
       
       Livre l = new Livre (this.titre, this.auteur , this.annee , this.isbn);
       System.out.println("le titre "+l.getTitre());
       System.out.println("lauteur"+l.getAuteur());
       System.out.println("lanner"+annee);
       System.out.println("lisbn"+isbn);
       
   }
}

