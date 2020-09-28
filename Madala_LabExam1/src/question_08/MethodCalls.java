/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_08;

/**
 *
 * @author S541226
 */
public class MethodCalls {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("8.1");
        System.out.println("Math.sqrt(4): "+Math.sqrt(4));
        System.out.println("Math.sin(2 * Math.PI): "+Math.sin(2 * Math.PI));
        System.out.println("Math.cos(2 * Math.PI): "+Math.cos(2 * Math.PI));
        System.out.println("Math.pow(2, 2): "+Math.pow(2, 2));
        System.out.println("Math.log(Math.E): "+Math.log(Math.E));
        System.out.println("Math.exp(1): "+Math.exp(1));
        System.out.println("Math.max(2, Math.min(3, 4)): "+Math.max(2, Math.min(3, 4)));
        System.out.println("Math.rint(-2.5): "+Math.rint(-2.5));
        System.out.println("Math.ceil(-2.5): "+Math.ceil(-2.5));
        System.out.println("Math.floor(-2.5): "+Math.floor(-2.5));
        System.out.println("Math.round(-2.5f): "+Math.round(-2.5f));
        System.out.println("Math.round(-2.5): "+Math.round(-2.5));
        System.out.println("Math.rint(2.5): "+Math.rint(2.5));
        System.out.println("Math.ceil(2.5): "+Math.ceil(2.5));
        System.out.println("Math.floor(2.5): "+Math.floor(2.5));
        System.out.println("Math.round(2.5f): "+Math.round(2.5f));
        System.out.println("Math.round(2.5): "+Math.round(2.5));
        System.out.println("Math.round(Math.abs(-2.5)): \n"+Math.round(Math.abs(-2.5)));   
        
        System.out.println("8.2: true\n");
        
        System.out.println("8.3: ");
        int degrees = 47;
        double radians= Math.toRadians(degrees);
        System.out.println(+radians+"\n");
        
        System.out.println("8.4: ");
        double angle = Math.PI/7;
        double degree = Math.toDegrees(angle);
        System.out.println(+degree+"\n");
        
        System.out.println("8.5: ");
        int random=0;
        System.out.println("Random integer between 34 and 55");
        random= 34 + (int)(Math.random()*(55-34));
        System.out.println("Random integer between 34 and 55: "+random);
        System.out.println("random integer between 0 and 999");
        random=(int)(Math.random()*1000);
        System.out.println("random integer between 0 and 999: "+random);
        
       System.out.println("random number between 5.5 and 55.5");
       double rando = 5.5+ (Math.random()*(55.5-5.5));
       System.out.println("random number between 5.5 and 55.5: "+rando+"\n");
       
       System.out.println("8.6: ");
       System.out.println("The Math class is in the java.lang package is "
               + "automatically imported.So, there is no need to import it  explicitly. \n");
       
       System.out.println("8.7: ");
        System.out.println("Math.log(Math.exp(5.5)): " +Math.log(Math.exp(5.5)));
        System.out.println("Math.exp(Math.log(5.5)): " +Math.exp(Math.log(5.5)));
        System.out.println("Math.asin(Math.sin(Math.PI / 6)): " +Math.asin(Math.sin(Math.PI / 6)));
        System.out.println("Math.sin(Math.asin(Math.PI / 6)): " +Math.sin(Math.asin(Math.PI / 6)));
    }
    
    
}
