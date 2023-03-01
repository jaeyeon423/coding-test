import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test21 {
    
    public static void main(String[] args) {
        Test21 test = new Test21();
        test.solution(5, new int[] {4,4,4,4,4,4});

    }

    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        int[] total = new int[N];
        int[] clear = new int[N];

        for(int stage : stages){
            for(int i = 0 ; i < stage ; i++){
                if(i >= N) {
                    clear[i-1]++;
                    break;
                }
                total[i]++;

                if((i-1) >= 0){
                    clear[i-1]++;
                }
            }            
        }

        System.out.println(Arrays.toString(clear));
        System.out.println(Arrays.toString(total));

        Failure[] failures = new Failure[N];
        for(int i = 0 ; i < N ; i++){
            int success = total[i] - clear[i];
            
            int failure;
            if(total[i] == 0){
                failure = 10000;
            }else{
                failure = (success * 10000)/total[i];
            }
            failures[i] = new Failure(i+1, 10000-failure);
        }
        
        List<Integer> list = new ArrayList<>();
        Arrays.stream(failures).sorted(Comparator.comparing(Failure::getFailure)).forEach(a ->{list.add(a.getIndex()); });;
        int idx = 0;
        for(int stage : list){
            answer[idx++] = stage;
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }

}

class Failure{
    private int index;
    private int falure;

    public Failure(int index, int failure){
        this.index = index;
        this.falure = failure;
    }

    public int getIndex(){
        return index;
    }

    public int getFailure(){
        return falure;
    }
}
