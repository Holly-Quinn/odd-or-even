package oddoreven;

import java.util.Scanner;

public class OddOrEven {

   
    public static void main(String[] args) {
          
       checkNum(getNum());
        
    }
    
    public static void checkNum(float num) {
        
        float rem = num % 2;
        
        if (rem > 0) {
            
            System.out.println("The Number is Odd");
            
        }
        
        else {
            
            System.out.println("The Number is Even");
            
        }
        
    }
    
    public static float getNum() {
        
       Scanner sc = new Scanner(System.in);  
       
       System.out.println("Please enter a number to test: ");
       
       float num = sc.nextFloat(); 
       
       return num;
        
    }
    
}
