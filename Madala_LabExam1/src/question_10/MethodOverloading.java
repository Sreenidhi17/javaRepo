/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_10;

/**
 *
 * @author Sreenidhi Madala
 */
public class MethodOverloading {
    public void method(){
        System.out.println("No arguments passed ");
    }
//    overloading with int
        public void method(int i){
        System.out.println("overloading with int i "+i);
    }
    
//    overloading with 2 int's
        public void method(int i, int j){
        System.out.println("overloading with int i and j "+i+" and "+j);
    }
        
   //    overloading with double
        public void method(double i){
        System.out.println("overloading with double "+i);
    }
     
    
}
