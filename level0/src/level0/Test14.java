package level0;

import java.util.Arrays;

public class Test14 {
    public static void main(String[] args) {
        Test14 test = new Test14();
        int[] tmp = {1,0,1,1,1,4,6};
        test.solution(tmp);
    }

    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        // Arrays.sort(num_list);


        for(int i = 0 ; i < num_list.length; i++){
            answer[num_list.length - i - 1] = num_list[i];
        }
        for(int i : answer){
            System.out.println(i);
        }
        return answer;
    }
}
