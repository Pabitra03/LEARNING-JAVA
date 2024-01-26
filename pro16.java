import java.util.Scanner;
public class pro16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age:- ");
        int age = sc.nextInt();
        switch(age){
            case 18:
            System.out.println("you can drink wine");
            break;
            case 20:
            System.out.println("you can drink ram");
            break;
            case 40:
            System.out.println("You can drink anything");
            break;
            case 60:
            System.out.println("Drinking alcohol is harmfull for your life");
            break;
            default:
            System.out.println("Alcohol is not for you");
            sc.close();
        }
        
    }
    
}
