import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        for(int N=1;N<=A;N++){
            int Z = N/100;
            int Y = N/10 - Z*10;
            int X = N%10;
            if(((int)Math.pow(Z,3) + (int)Math.pow(Y,3) + (int)Math.pow(X,3)) == N){
                System.out.println(N);
            }
        }
        
    }
}
