/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailApp;

/**
 *
 * @author d16diall
 */
public class emailApplication {
    
    
    public static void main(String[] args){
        Email email = new Email("Nijee", "Brown");
       email.setAlternatEmail("nijee41@yahoo.com");
     System.out.print(email.showInformation());
    }
}
