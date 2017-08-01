/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package add_usingmdarray;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author BinodNagrkoti
 */
public class Add_usingMDArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
          
        int myarrary1[][] = new int [2][3];
        int myarrary2[][] = new int [2][3];
        int myadd[][]     = new int [2][3];
            Scanner take = new Scanner(System.in);
            
            System.out.println("Enter the data in rows of matrix A:");
            System.out.println("-----------------------------------");
            for (int k=0; k<2;k++ ){
                for(int j=0;j<3;j++){
                   myarrary1[k][j]=take.nextInt();
                }
            }
            System.out.println("-----------------------------------");
            System.out.println("Enter the data in rows of matrix B:");
            System.out.println("-----------------------------------");
            for (int k=0; k<2;k++ ){
                for(int j=0;j<3;j++){
                   myarrary2[k][j]=take.nextInt();
                }
                
            }
            System.out.println("-----------------------------------");
            System.out.println("Result of Matrix A+B:"+myarrary1+"+"+myarrary2+":");
            System.out.println("-----------------------------------");
            for (int k=0; k<2;k++ ){
                for(int j=0;j<3;j++){
                  myadd[k][j]= myarrary1[k][j]*myarrary2[k][j];
                }
            }    
           for(int[]va:myadd){
            System.out.println(Arrays.toString(va));
    }
   
        
    }
    
}
