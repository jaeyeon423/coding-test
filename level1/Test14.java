import java.util.Arrays;

public class Test14 {
    public static void main(String[] args) {
        Test14 test = new Test14();
        int[] input_arr = {1,3,2,5,4};
        int budget = 9;
        int tmp = test.solution(input_arr, budget);
        System.out.println(tmp);
    }

    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);

        int len = d.length;

        for(int num : d ){
            if(budget < num)
                break;
            budget -= num;
            answer++;
        }
        return answer;
    }
}
