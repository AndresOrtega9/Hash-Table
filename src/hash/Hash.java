/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hash;

import java.util.Hashtable;

/**
 *
 * @author Andres Ortega
 */
public class Hash {

    /**
     * @param args the command line arguments
     */
 
    public static void main(String[] args) { 

	Hashtable donald  = new Hashtable();

	donald.put("Nombre","Donald");
	donald.put ("ciudad","Patolandia");

	System.out.println("Personaje : " + donald.get("Nombre"));
	System.out.println("Vive en: " + donald.get("ciudad"));
    }
}	

   
    

