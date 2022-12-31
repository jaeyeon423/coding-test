package level0;
import java.util.ArrayList;

public class Test3 {

	public static void main(String[] args) {
		Test3 test = new Test3();
		test.runTest();
	}
	
	void runTest() {
		solution(3, 12);
		solution(5, 15);
		solution(4, 14);
		solution(5, 5);
	}
	
	int cal_sum(ArrayList<Integer> list) {
		int ans = 0;
		for(int i : list) {
        	ans += i;
        }
		return ans;
	}
	
	public int[] solution(int num, int total) {

        ArrayList<Integer> list = new ArrayList<>();
        int cur = 0;
        int min = 0;
        for(int i = 0 ; i < num ; i++) {
        	list.add(cur);
        	cur++;
        }
        int sum = cal_sum(list);
        
        while(sum != total) {
        	if(sum > total) {
        		list.remove(list.size()-1);
        		list.add(0, min -1);
        		min--;
        		sum = cal_sum(list);
        	}else {
        		list.remove(0);
                list.add(cur);
                cur++;
                sum = cal_sum(list);
        	}
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0 ; i < list.size() ; i++) {
        	answer[i] = list.get(i);
        }
        return answer;
    }

}
