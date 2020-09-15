
public class TaylorSeries {

    public static double pow(double base, int power){
        double result = 1;

        for(int i = 0; i < power; i++){
            result *= base;
        }

        return result;
    }

    public static long factorial(int n){
        if (n == 1){
            return 1;
        }

        n *= factorial(n-1);
        return n;
    }

    public static double sin(double x, int numIt){
        double result = 0;
        boolean addTerm = true;

        for(int i = 0; i < numIt; i++){
            int n = (i * 2) + 1;
            double term = pow(x,n) / factorial(n);

            if (addTerm) {
                result += term;
            }

            else{
                result -= term;
            }
            addTerm = !addTerm;
        }

        return result;
    }

    public static void main(String[] args){
        System.out.printf("2.5 ^ 3 = %f\n", pow(2.5, 3));
        System.out.printf("factorial 3 = %d\n", factorial(3));

        final double PI = 3.14159265359;

        System.out.printf("%f \n", sin(PI,12));
    }
}
