/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dateproject;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author lcao2
 */
public class DateProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       boolean error = true;      
        int month = 0; 
        int day = 0; 
        int year = 0;
       
       do{
         try{
             System.out.println("Enter an integer value for month: ");
             month = scanner.nextInt();
             error = false;
        }catch(InputMismatchException e){ 
          System.out.println("Enter an integer value for month: ");
          month = scanner.nextInt();
          }
       
       }while( error);
       
      
       do{
         try{
             System.out.println("Enter an integer value for day: ");
             day = scanner.nextInt();
             error = false;
        }catch(InputMismatchException e){ 
          System.out.println("Enter an integer value for day: ");
          day = scanner.nextInt();
          }
          }while( error);
         
      do{
         try{
             System.out.println("Enter an integer value for the year: ");
             year = scanner.nextInt();
             error = false;
        }catch(InputMismatchException e){ 
          System.out.println("Enter an integer value for the year: ");
             year = scanner.nextInt();
          }
       
       }while( error);
      
       try{
        Date date = new Date(month, day, year);
        System.out.println(date);
       }catch(Exception e){
           System.out.println(e.getMessage());
       }
  }
}

