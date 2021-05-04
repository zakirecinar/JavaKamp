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
public class CreditCard {
    String name;
    int number;
    int expiration;
    int cvc;
    String country;
    int zipCode;
    
    public CreditCard(String name,int number,int expiration,int cvc, String country,int zipCode){
        this.name=name;
        this.number=number;
        this.expiration=expiration;
        this.cvc=cvc;
        this.country=country;
        this.zipCode=zipCode;
    }
    public void add(){
        System.out.println("Kredi kartınız başarıyla eklenmiştir.");
    }
    public void delete(){
        System.out.println("Kredi Kartınız Başarıyla Silinmiştir.");
    }
            
           
            
}
