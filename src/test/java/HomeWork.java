import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeWork {

        @Test
        public  void LoanTest() {
            double firstTenYears, secondTenYears, thirdTenYears, sum, sum2,sum3;
            float total = 50000;
            firstTenYears = 0.1;
            secondTenYears = 0.08;
            thirdTenYears = 0.06;
             sum = total * firstTenYears;
             sum2 = total * secondTenYears;
             sum3 = total * thirdTenYears;
            double x = sum + sum2 + sum3;
            System.out.println("Overpay with 10%: " + sum );
            System.out.println("Overpay with 8%: " + sum2 );
            System.out.println("Overpay with 6%: " + sum3 );
            System.out.println("Total in 30 years: " + x );
              Assertions.assertEquals(12000,x,"wrong number ");
        }

    }


