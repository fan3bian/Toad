package base;

import org.junit.Test;

import java.math.BigDecimal;

public class TestBigDecimal {
    @Test
    public void test(){
        BigDecimal zero = BigDecimal.ZERO;
        BigDecimal bigDecimal= new BigDecimal("-9.0");
        BigDecimal bigDecimal1= new BigDecimal(-Integer.MAX_VALUE);
        BigDecimal bigDecimal2= new BigDecimal(100009000);

        System.out.println(bigDecimal1.scale());

        System.out.println(bigDecimal2.scale());
    }
    @Test
    public void tes2t(){

        BigDecimal bigDecimal1= new BigDecimal("2.00");
        BigDecimal bigDecimal2= new BigDecimal("2.0");
        System.out.println(bigDecimal1.equals(bigDecimal2));
        System.out.println(bigDecimal1.scale());
        System.out.println(bigDecimal2.scale());
    }
}