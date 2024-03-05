public class pro52 {
    public static boolean even(int n){
        if(n % 2 == 0) 
        return true;
        else
        return false;
    }
    public static void main(String args[]) {
        //Retun with arrgument type
        boolean k = even(20);
        //System.out.println(k);
        if(k==true){      //For getting even in output.
            System.out.println("Even");
        }
        else{
            System.out.println("Not even");
        }

    }
    
}
