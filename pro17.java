import java.util.Scanner;
public class pro17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character:- ");
        char var = sc.next().charAt(0);
        switch(var){
            case 'r':
            System.out.println("you are going to hired");
            break;
            case 'c':
            System.out.println("You are going to married");
            break;
            case 'd':
            System.out.println("You are going to retire");
            break;
            default:
            System.out.println("Nothing to say");
            sc.close();
        }

    }
}
