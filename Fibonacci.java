package fibonacci;

/**
 *
 * @author rob93c
 */

import java.io.*;

public class Fibonacci {
    public static long fibonacci(long n){
        if(n == 0) {
            return 1;
        } else if(n == 1) {
            return 1;
        } else { 
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader (System.in));
        
        long n;
        
        System.out.println("Inserisci un numero maggiore o uguale a 0: ");
        n = Integer.parseInt(b.readLine());
        System.out.println("Fibonacci(" + n + ") = " + fibonacci(n));
    }
    
}