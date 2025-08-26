/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package osorioespinoza_20250825;

/**
 *
 * @author UFG
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ingresar_datos();
    
    
    }
    
    
    public static void ingresar_datos(){
    
        //INICIACION DE LA CLASE SCANNER
        Scanner scanner = new Scanner (System.in);

        //DECLARACION DE LA VARIABLE A UTILIZAR
        int[] edades = new int [10];
        int suma = 0;
        int total_pares = 0;
        int total_impares = 0;
        
        //MENSAJE AL USUARIO
        System.out.println("Ingrese " +edades.length+" edades");
        
        //SE RECORRE EL ARREGLO PARA ASIGNAR VALOR A CADA ELEMENTO
        for(int i = 0; i < edades.length; i++){
            //SE SOLICITA AL USUARIO EL INGRESO DE UN VALOR
            System.out.println("Edad "+i+": ");
            
            //SE LEE DESDE EL TECLADO EL VALOR DIGITADO POR EL USUARIO
            //Y SE ASIGNA A LA VARIABLE DE EDAD QUE CORRESPONDE SEGÚN
            //LA POSICIÓN EN LA ITERACIÓN
            edades[i] = scanner.nextInt();
            
            //PARA CALCULAR EL PROMEDIO SE REQUIERE SUMAR TODAS LAS
            //EDADES REGISTRADAS EN CADA ELEMENTO.
            suma+= edades[i]; 
        
            //ESTABLECER SI EL VALOR DIGITADO ES PAR O IMPAR
            if(  (edades[i] % 2) == 0 ){
                //ES PAR
                //SE INCREMENTA LA VAIRABLE ACUMULADORA
                total_pares++; 
            }else{
                //ES IMPAR
                //SE INCREMENTA LA VAIRABLE ACUMULADORA
                total_impares++;
            }
        }
        
        //SE CALCULA EL PROMEDIO
        double promedio = (double) suma/edades.length;
            
        //SE IMPRIME LA SALIDA
        System.out.println("Usted ha ingresado: "+edades.length+" edades");
        System.out.println("El promedio de las edades ingresadas es: "+promedio);
        System.out.println("Ingresó: "+total_pares+" edades pares y "+total_impares+" edades impares");
        
        //SE CIERRA EL OBJETIVO DE TIPO scanner, PORQUE YA NO HABRA MAS LECTURAS
        scanner.close();
        
        }
   
    }
