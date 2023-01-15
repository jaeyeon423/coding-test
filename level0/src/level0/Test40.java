package level0;

import java.math.BigInteger;

public class Test40 {
    public static void main(String[] args) {
        
        int a = 1;
        int b = 30;

        BigInteger a1 = BigInteger.valueOf(a);
        BigInteger b1 = BigInteger.valueOf(b);

        int gcd = b1.gcd(a1).intValue();

        a /= gcd;
        b /= gcd;

        System.out.println(a + " " + b);
        int answer = 0;
        while(b != 1){
            if(b % 2 == 0){
                b /= 2;
            }else if(b % 5 == 0){
                b /= 5;
            } else{
            }
        }

    }
}
