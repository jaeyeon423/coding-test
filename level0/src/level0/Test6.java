package level0;
import java.util.ArrayList;

public class Test6 {

	public static void main(String[] args) {
		Test6 test = new Test6();
		test.runTest();
	}
	
	void runTest() {
		int[] test_arr = {7, 77, 17};
		solution(test_arr);
	}
	
	public int solution(int[] array) {
        int answer = 0;
        ArrayList<String> arr_list = new ArrayList<>();
        
        for(int val : array) {
        	String[] tmp = Integer.toString(val).split("");
        	for(String word : tmp) {
        		arr_list.add(word);
        	}
        }
        
        for(String ans : arr_list) {
        	if(ans.equals("7")) {
        		answer++;
        	}
        }
        
//        System.out.println(answer);
        return answer;
    }
}
