/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EXERCICIOS;

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;

public class ex04 {
    public static void main(String [] args){
        
        Scanner x = new Scanner(System.in);
        
        int a,b;
        
        System.out.println("Digite o valor de a: " );
        a = x.nextInt();
        
        System.out.println("Digite o valor de b: " );
        b = x.nextInt();
        
        
        int soma = a + b;
        
        System.out.println("O valor da soma é: " + soma);
        
    }
    
}
