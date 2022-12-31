package level0;
import java.util.ArrayList;

public class Test4 {

	public static void main(String[] args) {
		Test4 test = new Test4();
		test.runTest();
	}
	
	void runTest() {
		solution("hello", "ohell");
	}
	
	public int solution(String A, String B) {
        int answer = 0;
        String[] a_arr = A.split("");
        String[] b_arr = B.split("");
        ArrayList<String> a_list = new ArrayList<>();
        ArrayList<String> b_list = new ArrayList<>();
        for(String a : a_arr) {
        	a_list.add(a);
        }
        for(String b : b_arr) {
        	b_list.add(b);
        }
        int num = 0;
        while(!A.equals(B)) {
        	if(num >= a_arr.length) {
        		answer = -1;
        		break;
        	}
        	
        	String tmp = a_list.remove(a_list.size()-1);
        	a_list.add(0, tmp);
        	
        	String cur_A = "";
        	for(String word : a_list) {
        		cur_A += word;
        	}
//        	
//        	System.out.println("cur A = " + cur_A + " B = " + B + " " + cur_A.equals(B));
        	num++;
        	
        	if(cur_A.equals(B)) {
        		answer = num;
        		break;
        	}
        	
        }
        
        System.out.println(answer);
        
        return answer;
    }

}
