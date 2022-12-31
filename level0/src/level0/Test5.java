package level0;
import java.util.ArrayList;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test5 test = new Test5();
		test.run_test();

	}
	
	void run_test() {
		solution("abc1Addfggg4556b", 6);
	}
	
	public String[] solution(String my_str, int n) {
        
        
        String[] str_arr = my_str.split("");
        ArrayList<String> str_list = new ArrayList<>();
        for(String word : str_arr) {
        	str_list.add(word);
        }
        int len = str_arr.length;
        
        int num = len / n;
        int last = len % n;
        String[] answer;
        if(last != 0) {
        	answer = new String[num+1];
        }else {
        	answer = new String[num];
        }
        
        
        for(int idx = 0; idx < num ; idx++) {
        	String tmp = "";
        	for(int j = 0 ; j < n ; j++) {
        		tmp += str_list.remove(0);
        	}
        	answer[idx] = tmp;
        }
        if(last != 0) {
        	String tmp = "";
	        for(int j = 0 ; j < last ; j++) {
	        	tmp += str_list.remove(0);
	        }
	        answer[num] = tmp;
        }
        
        
//        ArrayList<String> tmp_list = new ArrayList<>();
//        for(String ans : answer) {
//        	tmp_list.add(ans);
//        }
//        
//        System.out.println(tmp_list);
        
        return answer;
    }

}
