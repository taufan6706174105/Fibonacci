package fibonacci;

import java.util.Scanner;

public class Fibonacci {  
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int nilai;
        int sum = 0;
        
        System.out.println("Input:");
        nilai = scan.nextInt();
        ++nilai;
        long fibo[] = new long[nilai];
        fibo[0] = 0;
        fibo[1] = 1;
        
        System.out.println("Output:");
        for (int i = 2; i < nilai; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        for (int i = 1; i < nilai; i++) {
            sum = (int)(sum+fibo[i]);
        }
        
        System.out.println(sum);
        
    }   
    
}
