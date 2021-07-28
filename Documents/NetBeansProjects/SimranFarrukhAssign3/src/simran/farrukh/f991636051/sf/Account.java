package simran.farrukh.f991636051.sf;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.regex.*;
/**
 *
 * @author Simran
 */
public abstract class Account {
    private String email;
    private String password;
    
    static boolean emailValidation(String email){
        return email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]"
                + "+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{3})$");
    }
    
}
