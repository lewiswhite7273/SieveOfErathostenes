/*
 * Lewis White
 * To change this template file, choose Tools | Templates
 * This program will find prime numbers from a list
 */

package eratosthenes;

import javax.swing.JOptionPane;

/**
 *
 * @author lewhi7273
 */
public class Eratosthenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create array
        String inputWindow = JOptionPane.showInputDialog("Enter a number to find the primes up until it! ");
      int n = Integer.parseInt(inputWindow);
        boolean primes[] = new boolean[n];
        int i;
      
          for(i = 1; i<n ; i++){
              primes[i] = true;  // default set true 
          }
          
          //while there are numbers left
        for (int c = 2; c <= primes.length; c++) {      
              if(primes[c-1] == true){ 
                 System.out.println(c);
              }
            for (int j = c * c; j <= primes.length; j+=c) { // eliminates factors of c
                primes[j-1] = false;// sets each remaining to false
                }
            }     
       }
    }

              
              
             
                
            
            
                
            
                           
            
        
     
        
                
       
        
       
    
    

