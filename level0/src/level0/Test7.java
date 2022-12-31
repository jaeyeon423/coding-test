package level0;
import java.util.*;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test7 test = new Test7();
		test.run_test();
	}
	
	void run_test() {
		solution("Bcad");
	}
	
	public String solution(String my_string) {
        String answer = "";
        char[] c = my_string.toLowerCase().toCharArray();
        Arrays.sort(c);
        answer = new String(c);
        return answer;
    }

}
