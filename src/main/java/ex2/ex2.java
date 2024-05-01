/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2;

/**
 *
 * @author houssem
 */
public class ex2 {
    public static void main(String[] args) {
        Livre l0 = new Livre ();
        Livre l1 = new Livre ("aa" ,"bb");
        Livre l2 = new Livre("cc","dd" , "21686");       
        Livre l3 = new Livre ("ee","rrrr","167844","0");
        l0.afficher();
        l1.afficher();
        l2.afficher();
        l3.afficher();
        
}
}
