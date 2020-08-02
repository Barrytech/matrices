/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author barry
 */
import java.util.Scanner;
import java.util.Random;
//import BreezyGUI.*;
public class matrix {



   public static void main(String args[]){
       Scanner input = new Scanner(System.in);
       System.out.println("enter the number of rows: ");
       int rows = input.nextInt();
       System.out.println("enter the number of columns: ");
       int columns = input.nextInt();
       Random values = new Random();
       int[][] matrice = new int[rows][columns];
       System.out.println("");
       System.out.println("Here is your matrice filled with random values: ");
       System.out.println();
       for( int i=0; i<rows; i++){
           for(int j=0; j<columns; j++){
               matrice[i][j]= values.nextInt(100);
               System.out.print("          "+ matrice[i][j]+ "  ");
               
           }
           System.out.println();
           System.out.println();
       }
       
       
   }
          
}
