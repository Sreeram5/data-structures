import java.util.Scanner;
import java.util.*;


/**
 * A program that implements the sieve of Eratosthenes.
*/
public class Sieve
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Compute primes up to which integer?");
        int n = in.nextInt();

        // Your work goes here
        Set<Integer> pnums = new HashSet<>();
        for (int i = 2; i < n; i++){
            pnums.add(i);
        }

        Set<Integer> toRemove = new HashSet<>();
        for(int d = 2; d <= (n/2); d++){
            for (int num: pnums){
                if(num%d == 0 && num != d)
                    toRemove.add(num);
            }
        }
        pnums.removeAll(toRemove);
        System.out.println("The prime numbers up to " + n + " are:");
        for(int num: pnums)
            System.out.print(" " + num);
    }
}
