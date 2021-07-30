/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simran.farrukh.f991636051.sf;

import java.util.Scanner;
import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Simran
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Validations validate = new Validations();
        Scanner scan = new Scanner(System.in);
        String email, password, studentID;
        
        boolean bool = false;
        
        do{
            System.out.println("Enter your email: ");
            email = scan.nextLine();
            bool = validate.validateEmail(email);
            if(bool==false){
                System.out.println("Email is invalid. Please try again.");
            }
        }
        while(bool==false);
        
        do{
            System.out.println("Enter your password: ");
            password = scan.nextLine();
            bool = validate.validatePassword(password);
            if(bool==false){
                System.out.println("Password is invalid. Please try again. "
                        + "Password must contain at least 6 characters"
                        + "Password must contain no special characters"
                        + "Password must contain at least 1 number and 2 letters");
            }
        }
        while(bool==false);
        
        do
       {
           System.out.println("Enter the studentID : ");
           studentID=scan.nextLine();
 
           List<StudentAccount> students = new ArrayList<StudentAccount>();
           StudentAccount stud = new StudentAccount(studentID);
           students.add(stud);
           
           bool = validate.validateStudenID(studentID);
           if(bool==false)
           {
               System.out.print("Invalid studentID. Must start with lower case "
                       + "s followed by 9 digits");
           }
       }while(bool==false);
        
        System.out.println("Student email: " + email);
        System.out.println("Student password: " + password);
        System.out.println("Student studenId: " + studentID);
    }
    
}
