
package oop;

import java.util.Scanner;

public class AddTwoNumbers {
    
    public static void main(String[] args) {
       
        int num1 = 5, num2 = 6, sum;
        
        sum = num1 + num2;
        
        System.out.println("Sum of two number:"+sum);
        
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter fist Number:");
        
        num1 = sc.nextInt();
        
        System.out.println("Enter second number:");
        num2 = sc.nextInt();
        
        sc.close();
        
        sum = num1 + num2;
        System.out.println("Output"+sum);
        
        
    }
    
    
    
}
