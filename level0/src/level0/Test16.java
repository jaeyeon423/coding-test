package level0;

import java.util.ArrayList;
import java.util.Collections;

public class Test16 {
    public static void main(String[] args) {
        Test16 test16 = new Test16();
        test16.solution(24);
    }

    public int[] solution(int n) {
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = n ; i > 0 ; i--){
            if(n % i == 0){
                list.add(i);
            }
        }
        int[] answer = new int[list.size()];
        Collections.sort(list);
        for(int i = 0; i < list.size() ; i++){
            answer[i] = list.get(i);
        }
        // System.out.println(list);
        return answer;
    }
}
