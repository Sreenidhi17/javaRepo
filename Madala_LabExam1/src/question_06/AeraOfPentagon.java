/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_06;

import java.util.Scanner;

/**
 *
 * @author Sreenidhi Madala
 */
public class AeraOfPentagon {

    public static void main(String[] args) {

        double area;
        double s;
//        creating the Scanner object so that we can read the input values        
        Scanner sc = new Scanner(System.in);
//      to get the entry for vertex 
        System.out.print("Enter the length from the center to a vertex: ");
        double r = sc.nextDouble();
        s = 2 * r * (Math.sin(Math.PI/5));
//        calculating the area
        area = (5*(Math.pow(s, 2)))/(4*(Math.tan(Math.PI/5)));        
        System.out.println("The area of the pentagon is " +String.format("%.2f",
                area));
    }  
}