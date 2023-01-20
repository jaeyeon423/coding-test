import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Test6 {
    public static void main(String[] args) {
        int[] input = {0,0,0,0};

        Test6 test = new Test6();
        
        System.out.println(test.solution(input, 7));
    }

    public int solution(int[] scoville, int K) {
        int answer = 0;

        Arrays.sort(scoville);
        if(scoville[0] >= 7){
            return 1;
        }

        ArrayList<Integer> s_list = new ArrayList<>();

        for(int num : scoville){
            if(num < K){
                s_list.add(num);
            }else{
                break;
            }
        }
        
        
        while((s_list.get(0) < K ) && (s_list.size() >= 2)){
            System.out.println(s_list);
            int tmp = s_list.remove(0) + (s_list.remove(0) * 2);
            s_list.add(tmp);
            s_list.sort(Comparator.naturalOrder());
            answer++;
        }
        System.out.println("->" + s_list);

        if(s_list.get(0) < K){
            return -1;
        }

        
        return answer;
    }


}
