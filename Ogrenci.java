/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ogrenci;

/**
 *
 * @author zakir
 */
public class Ogrenci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    CreditCard creditCard1=new CreditCard("Zakire",180316072,23042021,196,"Turkey",45);
    School school1=new School();
    school1.create();
    creditCard1.add();
    creditCard1.delete();
    }
    
}
