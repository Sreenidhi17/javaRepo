/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_02;

/**
 *
 * @author Sreenidhi Madala
 */
public class FanDriver {

    public static void main(String[] args) {
//      creating the Fan object so that we can set and get the values from that 
//      class
        Fan fan01 = new Fan();
        System.out.println("Fan details:");
        System.out.println("Fan Speed: " + fan01.getspeed());
        System.out.println("Is Fan On?: " + fan01.ison());
        System.out.println("Fan Radius: " + fan01.getradius());
        System.out.println("Fan Color: " + fan01.getcolor());
        System.out.println(fan01);
        System.out.println("Fan details:" + fan01.toString());
        System.out.println("We get these values as null" + ",Beacuse the "
                + "constructor we created was a no-argument constructor "
                + "with an empty body and String returns null, int returns 0"
                + "and double returns 0.0 and boolean false");
        System.out.println("\n*********************************************\n");
//        Setting up the values for the objects
        fan01.setspeed(fan01.slow);
        fan01.seton(true);
        fan01.setradius(2.0);
        fan01.setcolor("black");

        System.out.println("Fan details:");
        System.out.println("Fan Speed: " + fan01.getspeed());
        System.out.println("Is Fan On?: " + fan01.ison());
        System.out.println("Fan Radius: " + fan01.getradius());
        System.out.println("Fan Color: " + fan01.getcolor());
        System.out.println(fan01.toString());
        System.out.println("\n*********************************************\n");
    }
}
