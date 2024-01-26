import java.util.Scanner;
public class pro20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter yor marks in CAL:- ");
        int c = sc.nextInt();
        System.out.print("Enter your mark in UPM:- ");
        int u = sc.nextInt();
        System.out.print("Enter your marks in ICP:- ");
        int i = sc.nextInt();
        float avg = (c+u+i)/3.0f;
        if(avg>=40 && c>=33 && u>=33 && i>=33){
            System.out.println("You are pass");
        }
        else{
            System.out.println("You are fail");
        }
        sc.close();
    }
        
        
    
    
}
