package zarema__lab6;


public class Zarema__Lab6 {
public static double myDiv(double a, double b, double x) throws Exception {
        double y;
         if (x >= 5) {
            y = ((5 * (a*a + b*b)) / (x - 4));
            
        } else {
            y = (6*a*b-5*x);
            
        }
        if (!(Double.isNaN(y)) && (!Double.isInfinite(y))) {
            return y;

        } else {
            throw new Exception();
        }
    }
    public static void main(String[] args) throws Exception {
         System.out.println(myDiv(5,9,7));
    }
    
}
