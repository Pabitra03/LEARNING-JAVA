public class pro34 {
    public static void main(String[] args) {
        //Third
        //Using for loop
        System.out.println("The multiplication table of 5 is:- ");
        int n = 5;
        /*for(int i=1; i<=10; i++){
            int mul = n*i;
            System.out.println(n+" * "+i+" = "+mul);
        }*/

        //USing while loop 
        int num=1;
        while(num<=10){
            int mul2= n * num;
            System.out.printf("%d * %d = %d\n",n , num , mul2);
            num++;
        }
        
    }
    
}
