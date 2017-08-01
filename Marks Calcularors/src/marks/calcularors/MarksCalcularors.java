/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marks.calcularors;

import java.util.Scanner;

/**
 *
 * @author BinodNagrkoti
 */
public class MarksCalcularors {

   
    public static void main(String[] args) {
        
        //float ValueofProcess;
          
        System.out.println("~~||WELCOME TO THE MARKS CALCULATORS||~~");
        try{
            while(true){
            Scanner While =new Scanner (System.in); 
            Display callDisplayClass= new Display();
            Process callProcessClass =new Process();
            callDisplayClass.result(callProcessClass.calCulate());
                System.out.println("~~||If you want to calculate other subject too then click 'y' or for exit press 'n'||~~");
                char ch= While.next().charAt(0);
                if("n".equals(ch)){
                   System.exit(1);
                }
            }
        }catch(Exception ex){
            System.out.println(ex);
        }
        
    }
    
}
