import java.util.Arrays;
import java.util.Collections;

public class Test4 {
    public static void main(String[] args){
        Test4 test = new Test4();
        test.solution(118372);
    }
    public long solution(long n) {
        String[] n_arr = String.valueOf(n).split("");
        Arrays.sort(n_arr, Collections.reverseOrder());
        String n_str = "";
        for(String num : n_arr){
            n_str += num;
        }
        long answer = Long.valueOf(n_str);

        return answer;
    }
}
