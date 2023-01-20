import java.util.Arrays;

public class Test5 {
    public static void main(String[] args){
         int[] price = {2, 1, 1, 1, 3};

         Test5 test = new Test5();
         test.solution(price);
    }

    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for(int i = 0 ; i < prices.length - 1; i++){
            int cur_val = prices[i];
            for(int j = i+1 ; j < prices.length; j++){
                System.out.println(cur_val + " " + prices[j]);
                if(cur_val > prices[j]){
                    System.out.println("-------");
                    answer[i] = j - i;
                    break;
                }
                answer[i] = prices.length - i - 1;
            }
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
