import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.net.Inet4Address;

public class NewTest {
    private String text;// variable for one use
    @Test
        public void Test (){
        Integer a = 56;
        Integer b = 45;
        Integer c = 32;
        Integer d = 66;
        text = "The sum is: ";
        Integer sum = a + b;
        Integer sum2 = c + d;
        sumAndPrint(a, b); // system.out.print() the same !!!
        sumAndPrint(c, d);
        Assertions.assertEquals(145, a + b,"Wrong sum" );// проверка
    }
    private void sumAndPrint(int a , int b){
        Integer sum = a + b + b ; // main work
        System.out.println(text + sum);
    }
}
