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


        for(int i = 0 ; i < t.length() - len + 1 ; i++){
            String t_word = t.substring(i, i+len);
            System.out.println(t_word);
            if(BigInteger.valueOf(t_word) <= Integer.parseInt(p)){
                answer++;
            }
        }

        

        return answer;
    }

}
