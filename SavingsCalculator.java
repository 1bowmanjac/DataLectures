import java.time.Year;

public class SavingsCalculator {

    public static void main(String[] args){
        // calculate annual interest earned
        double principle = 1000.0;
        float principle2 = 1000.0f;
        double interestRate = 0.035;
        int numYears = 10;

        for(int i = 0; i < numYears; i++){
            principle += principle * interestRate;
        }

        System.out.printf(" principle = %.3f    intrest rate = %.3f \n",principle,interestRate);

        //how long to save 1 million
        principle = 0.0;
        numYears = 0;
        double annualContribution = 5000;
        while(principle < 1000000.0){
            principle += interestRate*principle + annualContribution;
            numYears++;
        }

        System.out.printf("it took %d years to save 1000000 \n",numYears);

    }
}
