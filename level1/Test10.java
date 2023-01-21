import java.util.Arrays;
import java.util.Collections;

public class Test10 {
    public static void main(String[] args) {
        Test10 test = new Test10();
        test.solution(2500, 1000000000, 2500);
    }

    public long solution(int price, int money, int count) {
        long answer = -1;

        int total_count = 0;
        for(int i = 1; i <= count ; i++){
            total_count += i;
        }

        long total_price = price * (long)total_count;

        System.out.println(price + " x " + total_count + " = " + total_price);

        return (total_price > money) ? price-money : 0;
    }
}
