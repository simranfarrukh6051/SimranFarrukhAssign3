/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simran.farrukh.f991636051.sf;

/**
 *
 * @author Simran
 */
public class Validations {
    
    static boolean validateEmail(String email){ //checks email format
        return email.matches( "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{3})$");
    }
   
    static boolean validatePassword(String password) {
        if (password.length() < 8) return false; //checks length 

        if (true) {
            int counter = 0; //counter for password characters
  
            for (int i = 0; i <= 9; i++) { //checks for at least 1 number
                String str1 = Integer.toString(i); //numbers to string
                if (password.contains(str1)) {
                    counter = 1;
                }
            }
            if (counter == 0) {
                return false;
            }
        } 
        
        if (!(password.contains("@") || password.contains("#")
              || password.contains("!") || password.contains("~")
              || password.contains("$") || password.contains("%")
              || password.contains("^") || password.contains("&")
              || password.contains("*") || password.contains("(")
              || password.contains(")") || password.contains("-")
              || password.contains("+") || password.contains("/")
              || password.contains(":") || password.contains(".")
              || password.contains(", ") || password.contains("<")
              || password.contains(">") || password.contains("?")
              || password.contains("|"))) { // checks for at least 1 special character
            return false;
        }
        
         if (true) {
            int count = 0;
            for (int i = 65; i <= 90; i++) {// checks for capital letters
                char c = (char)i; //typecast
 
                String str1 = Character.toString(c);
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return false;
            }
         }
        return true;
    }
}
        
    
