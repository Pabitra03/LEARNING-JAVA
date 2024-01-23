import java.util.Scanner;
public class pro11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:- ");
        String name = sc.nextLine();
        name = name.toLowerCase();
        System.out.println(name);
        sc.close();
    }
    
}
