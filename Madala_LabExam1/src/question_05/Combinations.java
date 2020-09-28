/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_05;

/**
 *
 * @author Sreenidhi Madala
 */
public class Combinations {

    public static void main(String[] args) {

        int s = 0;
//        Taking the first value of for the combination upto 7
        for(int i=1;i<=7;i++)
        {
//        Taking the second value with second value which should be i+1, because  
//             we dont want the value already in the first line for the 
//            combination upto 7
            for(int j=i+1;j<=7;j++)
            {
//              printing the values of i and j in combinations  
                System.out.println(i+" "+j);
//             Incrementing the value so that we get the new combination  
               s++; 
            } 
        } 
        System.out.println("The total number of all combinations is " +s);        
    }  
}
