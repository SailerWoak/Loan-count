import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeWork {
        @Test
        public  void LoanTest() {

            float total = 50000;
            double firstTenYears = 0.1;
            double secondTenYears = 0.08;
            double thirdTenYears = 0.06;
            double sum = total * firstTenYears;
            double sum2 = total * secondTenYears;
            double sum3 = total * thirdTenYears;
            double x = sum + sum2 + sum3;
            System.out.println("He will over pay for 30 years: " + x );
              Assertions.assertEquals(12000,x,"wrong number ");
        }

    }


