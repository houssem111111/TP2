/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Question supplementaire : si l'encapsulation est modifiée pour decalerer les attributs de classe Etudiant comme public il n'est pas necessaire d'utiliser getter et setter pour acceder et modifier les attributs
 */

package com.eniso.tp2systemgestionetudiant;
import java.util.ArrayList;
        
        

/**
 *
 * @author LENOVO
 */
public class TP2SystemGestionEtudiant {

    public static void main(String[] args) {
        ArrayList l =new ArrayList();
        SystemGestionEtudiant s= new SystemGestionEtudiant();
        s.ajouterEtudiant("a", "b", 0, "c");
        s.ajouterEtudiant("d", "e", 1, "f");
        s.ajouterEtudiant("g", "h", 2, "j");
        s.ajouterEtudiant("i", "k", 3, "l");
        s.ajouterEtudiant("m", "n", 4, "o");
        s.ajouterEtudiant("p", "w", 5, "x");
        s.afficherEtudiant();
        s.modiferEmailEtudiant(3, "dude@gmail.com");
        s.supprimerEtudiant(2);
         s.afficherEtudiant();
         
         
         /*
         Question supplementaire : si l'encapsulation est modifiée pour decalerer les attributs de classe Etudiant comme public il n'est pas necessaire d'utiliser getter et setter pour acceder et modifier les attributs
*/
        
        
    }
}
