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
public class Process {
        int subjectCount;
        String[] subjectName;
        int[] subjectMarks;
        int loop;
        int subjectTot;
        Scanner nums = new Scanner(System.in);   
    public int calCulate(){
    System.out.println("~~||Please enter the number of subjects and marks of the subjects||~~");
            subjectCount = nums.nextInt();
            subjectName = new String[subjectCount];
            subjectMarks =new int[subjectCount];
            for(loop=0;loop<subjectCount;loop++){
                subjectName[loop]= nums.next();
                subjectMarks[loop]=nums.nextInt();
            }
            for(loop=0;loop<subjectName.length;loop++){
                subjectTot = subjectTot+subjectMarks[loop];
            }
            return (subjectTot/subjectName.length);
    }
}
