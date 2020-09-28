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
public class MethodOverloadingDriver {

    public static void main(String[] args) {
       MethodOverloading mOverloading = new MethodOverloading();
       mOverloading.method();
       mOverloading.method(5);
       mOverloading.method(6, 7);
       mOverloading.method(10.0);
    }  
}
