public class pro18 {
    public static void main(String[] args) {
        // Enhanced Switch

        String var = "march";
        switch(var){
            case "january" -> System.out.println("New year");
            case "february" -> System.out.println("Saraswati puja");
            case "march" -> System.out.println("Maha shiv ratri");
            case "april" -> System.out.println("Holi");
            default -> System.out.println("Use your calender");
        }
    }
    
}
