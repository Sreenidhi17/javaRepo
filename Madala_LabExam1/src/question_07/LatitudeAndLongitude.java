/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_07;

import java.util.Scanner;

/**
 *
 * @author Sreenidhi Madala
 */
public class LatitudeAndLongitude {

    public static void main(String[] args) {
        // TODO code application logic here
        double d;
        double radius = 6371.01; 
        double x1;
        double y1;
        double x2;
        double y2;
                
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        x1 = scan.nextDouble();
        y1 = scan.nextDouble();
        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        x2 = scan.nextDouble();
        y2 = scan.nextDouble();
        d = radius *(Math.acos(Math.sin⁡(Math.toRadians(x1))
                *Math.sin⁡(Math.toRadians(x2))+Math.cos⁡(Math.toRadians(x1))
                *Math.cos⁡(Math.toRadians(x2))*Math.cos⁡(Math.toRadians(y1)- 
                        Math.toRadians(y2))));
        System.out.println("The distance between the two points is :"+d+"km");
        
        
    }
    
}
