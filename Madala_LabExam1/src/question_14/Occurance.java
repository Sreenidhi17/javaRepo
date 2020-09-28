/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_14;

import java.util.Scanner;

/**
 *
 * @author Sreenidhi Madala
 */
public class Occurance {

    public static void main(String[] args) {
 //        creating the Scanner object so that we can read the input values       
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String occurance = sc.nextLine();
        System.out.print("Enter string 2: ");
        String search = sc.nextLine();
        int lastIndex = 0;
        int count = 0;
//        we are checking the index of the search item and inctementing it by 1
        while((lastIndex =occurance.indexOf(search,lastIndex)) != -1){          
                count ++;
                lastIndex++;
        }
        System.out.println("The number of occurrences of back in the above "
                + "string are " +count);                
    }  
}
