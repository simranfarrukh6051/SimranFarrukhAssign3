/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simran.farrukh.f991636051.sf;
import java.util.Scanner;
import java.util.regex.*;

/**
 *
 * @author Simran
 */
public abstract class Account {
    private String email;
    private String password;
    
    public static void main(String[] args) {
        
        Validations validate = new Validations();
        Scanner scan = new Scanner(System.in);
        String email, password;
        
        boolean bool = false;
        
        do{
            System.out.println("Enter your email: ");
            email = scan.nextLine();
            bool = validate.validateEmail(email);
            if(bool==false){
                System.out.println("Email is invalid. Please try again.");
            }
        }while(bool==false);
    }
}

