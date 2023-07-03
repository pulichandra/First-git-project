<<<<<<< HEAD
//git project
=======
/// git project
>>>>>>> python-programming
import java.util.Scanner;

public class Fibanocci {
    static int a=10,b=a+1,c=0;
//     static void printFibonacci(int n){
//         for(int i=1;i<=n;i++){
//             c=a+b;
//             System.out.print(" "+a);
//             a=b;
//             b=c;
//         }
//         static void FibonacciUp(int n1){
//             while (a<=n1){
//                 System.out.print(" "+a);
//                 c=a+b;
//                 a=b;
//                 b=c;
//             }
//         }

    static void printInBetween(int n,int n1) {
        while (a<=n1){
            if(a>=n){
                System.out.print(" "+a);
                c=a+b;
                a=b;
                b=c;
            }
        }
    }
    public static void main(String[] args) {
        int n=10;
        int n1=150;
//        printFibonacci(n);
//        FibonacciUp(n1);
        printInBetween(n,n1);
    }


}
