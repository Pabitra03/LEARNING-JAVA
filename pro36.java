import java.util.Scanner;
public class pro36 {
    public static void main(String[] args) {
        //Fifth
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int n = sc.nextInt();
        int factorial = 1;

        //using for loop
        System.out.println("Using for loop...");
        for(int i=1; i<=n; i++){
            factorial *= i;
        }
        System.out.printf("Factorial of %d is:- %d\n", n , factorial);



        //Using while loop
        System.out.println("Now using while loop...");
        int fac2 = 1;
        int j =1;
        while(j<=n){
            fac2 *= j;
            j++;
        }
        System.out.printf("The factorial of %d is:- %d",n,fac2);
        sc.close();
    }
    
}
