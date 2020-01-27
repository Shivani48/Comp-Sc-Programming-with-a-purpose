public class SumOfSines {

    public static void main(String[] args){
        System.out.println( Math.sin(2 * Math.toRadians(Double.parseDouble(args[0]))) + Math.sin(3 * Math.toRadians(Double.parseDouble(args[0]))));
    }
}
