import java.util.Scanner;
public class pro1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:-");
        int a = sc.nextInt();
        if(a%2==0)
        {
            System.out.print("The number is even");
        }
        else
        {
            System.out.print("The number is odd");
        }
        sc.close();
    }
    
}
