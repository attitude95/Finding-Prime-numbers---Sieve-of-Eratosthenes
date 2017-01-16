
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chandu_boss
 */
public class FindingPrimeNumbersSieveOfEratosthenesGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        //Array of n prime indexes
        int [] p=new int[n];
        //p[i] is 0 if prime else 1
        for(int i=0;i<=Math.sqrt(n);i++){
            if(p[i]==0){
                for(int j=i;j<n;j++){
                    p[j]=isPrime(j);
                }
            }
        }
        for(int i=0;i<n;i++){
            if(p[i]==0){
                System.out.println(i+" is a Prime number");
            }
            else
                System.out.println(i+" isn't a Prime Number");
        }
    }

    private static int isPrime(int j) {
        int flag=0;
        for(int i=2;i<=Math.sqrt(j);i++){
            if(j%i==0){
                flag++;
                break;
            }
        }
        return flag;
    }
    
}
