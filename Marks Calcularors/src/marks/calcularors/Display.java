/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marks.calcularors;

/**
 *
 * @author BinodNagrkoti
 */
public class Display {
    public float result(float resper){
      //  int subjectTot=0;
            if(resper==0){
                System.out.println("Your Grade is 'N'|Description:'Not Graded'");
                System.out.println("\"Grade Point:\""+resper);
            }else if(resper>=1 || resper<20){
                System.out.println("\"Your Grade is 'E'|||Description:'Insufficient'\"");
                System.out.println("\"Grade Point:\""+resper);

            }else if(resper>=20 || resper<40  ){
                System.out.println("\"Your Grade is 'D'|||Description:'Below Average'\"");
                System.out.println("\"Grade Point:\""+resper);

            }else if(resper>=40 || resper<50  ){
                System.out.println("\"Your Grade is 'C'|||Description:'Average'\"");
                System.out.println("\"Grade Point:\""+resper);
            }else if(resper>=50 || resper<60  ){
                System.out.println("\"Your Grade is 'C+'|||Description:'Above Average'\"");
                   System.out.println("\"Grade Point:\""+resper);
            }else if(resper>=60 || resper<70  ){
                System.out.println("\"Your Grade is 'B'|||Description:'Good'\"");
                System.out.println("\"Grade Point:\""+resper);
            }else if(resper>=70 || resper<80  ){
                System.out.println("\"Your Grade is 'B+'|||Description:'Very Good'\"");
                System.out.println("\"Grade Point:\""+resper);
            }else if(resper>=80 || resper<90  ){
                System.out.println("\"Your Grade is 'A'|||Description:'Excellent'\"");
                System.out.println("\"Grade Point:\""+resper);
            }else if(resper>=90 || resper<100  ){
                System.out.println("\"Your Grade is 'A+'|||Description:'Outstanding'\"");
                System.out.println("\"Grade Point:\""+resper);
            }
        return 0;
    }
    
}
