import java.util.Scanner;
public class pro4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number in km you want to change in meter:- ");
        float a = sc.nextFloat();
        float meter = (a*1000);
        System.out.println(meter);
        sc.close();



    }
    
}
