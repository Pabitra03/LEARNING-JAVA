import java.util.Scanner;
public class pro21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the anual income:- ");
        double income = sc.nextDouble();
        double tax = 0;
        if(income>2.5 && income<=5.0 ){
            tax += (income*5.0)/100.0;
            System.out.println("Your amount is: "+ tax);
        }
        else if(income>=5.0 && income<=10.0){
            tax += (income*20.0)/100.0;
            System.out.println("Your amount is:- "+tax);
        }
        else if(income>10){
            tax += (income*30.0)/100.0;
            System.out.println("Your amount is:- "+tax);
        }
        else{
            System.out.println("No need to pay tax");
        }
        sc.close();
    }
    
}
