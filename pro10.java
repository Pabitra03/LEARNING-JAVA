public class pro10 {
    public static void main(String[] args) {
        //Methods of string

        //Length method
        String name = "Pabitra";
        int value = name.length();
        System.out.println(value);

        //Lowercase method
        String value2 = name.toLowerCase();
        System.out.println(value2);

        //Uppercase method
        String value3 = name.toUpperCase();
        System.out.println(value3);

        //Trim method
        String name2 = "    Pabitra      ";
        System.out.println(name2);
        String value5 = name2.trim();
        System.out.println(value5);
        

        //Substring method
        System.out.println(name.substring(3));
        System.out.println(name.substring(0));

        //Substring method but start and end 
        System.out.println(name.substring(1, 5));
        
        //Replace method
        System.out.println(name.replace('a', '$'));
        System.out.println(name.replace("tra", "pabi"));

        //StratsWith method
        System.out.println(name.startsWith("Pab"));
        

        //EndsWith method
        System.out.println(name.endsWith("tra"));

        //charAt method
        System.out.println(name.charAt(2));

        //Indexof method
        System.out.println(name.indexOf("a"));
        System.out.println(name.indexOf("a", 4));
        //if  String not matches the answer then it returns -1.
        System.out.println(name.indexOf("p549846"));


        //LastIndexof method
        System.out.println(name.lastIndexOf("tra"));
        System.out.println(name.lastIndexOf("Pab", 4));

        //Equal method
        System.out.println(name.equals("Pabitra"));

        //EqualsIgnorecase method
        System.out.println(name.equalsIgnoreCase("PaBitra"));








    }
    
}
