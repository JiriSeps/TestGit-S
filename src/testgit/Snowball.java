/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
/**
 *
 * @author fiwie
 */
public class Snowball {
    public static void main(String[] args) {
       int n = 10;
       for(int i = n; i <= 1*n;i++){ System.out.printf("%30s %n", "_---_"); }
       for(int i = n; i <= 1.1*n;i++){ System.out.printf("%31s %n", "|     |"); }
       for(int i = n; i <= 1.1*n;i++){ System.out.printf("%30s %n", "/"); }
       
        for (int i = -n; i <= n; i++) {
            for (int j = -n; j <= n; j++) {
                if (i*i + j*j <= n*n) 
                    System.out.print("/⭒ ");
                else                  
                    System.out.print(" ⭒ ");
            }
            
            System.out.println("");
        }   
    }
}
