import java.util.Scanner;
public class pro23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your website name:- ");
        String website = sc.next();
        if(website.endsWith(".com")){
            System.out.println("This is a commercial website");
        }
        else if(website.endsWith(".org")){
            System.out.println("This ia a commercial website");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is a Indian website");
        }
        sc.close();
    }
    
}
