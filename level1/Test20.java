import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;

public class Test20 {
    public static void main(String[] args) {
        String in1 = "10203";
        String in2 = "15";

        Test20 test = new Test20();
        test.solution(in1, in2);
    }

    public int solution(String t, String p) {
        int answer = 0;
        int len = p.length();

        int sum = 0;
        int[] arr = {1, 2, 3, 4, 5};
        for(int i = 0 ; i < 10 ; i++){
            sum += arr[i];
        }
        System.out.println(sum);

        

        return answer;
    }

}
