/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailApp;

import java.util.Scanner;

/**
 *
 * @author d16diall
 */
public class Email {
    // create objects 
 private String firstName;
 private String lastName;
 private String password;
 private String email;
 private String department;
 private int mailBoxCapacity = 1000;
 private String alternateEmail;
 private int defaultPasswordLength = 10;
 private String companyBillion = "company.com";
 //Constructor to receive the first name and the last name
 public Email(String firstName, String lastName){
     this.firstName = firstName;
     this.lastName = lastName;
    
    //Call method that will ask for the department and then return the department
    this.department= setDepartment();


//call method that will set a random password
    this.password = setRandomPassword(defaultPasswordLength);
    System.out.println("Your password is: " + this.password);

//Compile elements to generate email
    email = firstName.toLowerCase()+ "." + lastName.toLowerCase()+ "@" + department+companyBillion;

 }
 
  // Ask for the department
 private String setDepartment(){
     System.out.print("New Worker:" + firstName+ " Department Code \n Enter the department:\n 1 for Sale \n 2 for Development \n 3 for Accounting\n 0 for none \n Enter Department Codes ");
 Scanner scan = new Scanner(System.in);
 int departmentChoice =scan.nextInt();
 if(departmentChoice == 1){
     return "sales";
 }
     else if(departmentChoice ==2){
             return "dev";
     }
             else if ( departmentChoice == 3){
             return"acct";}
             else {
        return "";
             }
             }
              //Generate a random password
            private String setRandomPassword(int length){
                String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$";
             char [] password = new  char[length];
            for(int i = 0; i<length; i++){
               int random = (int)(Math.random()* passwordSet.length());
                password[i] = passwordSet.charAt(random);
            }
            return new String(password);
            }
 
 //Set the mailboxCapacity
 
 public void setMailBoxCapacity(int capacity){
this.mailBoxCapacity = capacity;
}
 //Set the alternate email
 public void setAlternatEmail(String email){
     this.alternateEmail = email;
 }
 
 //If you want to change the password
 public void changePassword(String password){
     this.password = password;
 }
 //Get mail box capacity
 public int getMailBoxCapacity(){
     return mailBoxCapacity;   
}
 //Get alternate email address
 public String getAlternateEmail(){
return alternateEmail;
 }
public String getPassword(){
    return password;
}
public String showInformation(){
    return "Display Name:" + firstName + " " + lastName+ ""+ " \nEmail:"+ email+ " "+"\nMailbox Capacity:" +" "+ mailBoxCapacity +" " + "mb";
}

}


