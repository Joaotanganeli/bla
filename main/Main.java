/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Aluno
 */
public class Main {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta c1 = new Conta(1000, "batata", 1);
        Conta c2 = new Conta(3000, "esquerda", 2);
        Conta c3 = new Conta(4000, "offnile", 3);
        c1.almondega();
        c2.almondega();
        c3.almondega();          
    }
    
}
