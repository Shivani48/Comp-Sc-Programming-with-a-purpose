public class CheckDate {

    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);

        if(m == 3 && d >= 20){
            System.out.print("True");
        }
        else if( m > 3 && m < 6){
            System.out.print("True");
        }
        else if( m == 6 && d <= 20){
            System.out.print("True");
        }
        else
            System.out.print("False");
    }
}
