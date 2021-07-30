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
        if (password.length() < 6) return false; //checks length 

        int characterCount = 0;
        int numberCount = 0;
        for (int i = 0; i < password.length(); i++) {//chars and nums counter
            char c = password.charAt(i);
            if (verifyNumber(c)) numberCount++;
            else if (verifyLetter(c)) characterCount++;
            else return false;
        }
        return (characterCount >= 2 && numberCount >= 1); 
    }

    public static boolean verifyLetter(char c) { //letter verifier
        c = Character.toUpperCase(c);
        return (c >= 'A' && c <= 'Z');
    }

    public static boolean verifyNumber(char c) { //number verifier
        return (c >= '0' && c <= '9');
    }
    
    
}
