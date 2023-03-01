import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test20 {
    public static void main(String[] args) {
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};   
        Test20 test = new Test20();
        test.solution(N, stages);
    }

    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        int[] total = new int[N];
        int[] clear = new int[N];

        Arrays.fill(total, 1);

        for(int stage : stages){
            for(int i = 0 ; i < stage ; i++){
                if(stage >= N) break;
                total[i]++;
            }

            for(int i = 1 ; i < stage ; i++){
                if(i >= N) {
                    clear[i-1]++;
                    break;
                }
                if(stage == 1) break;
                clear[i-1]++;
            }
        }
        //125 428 500 500 
        // System.out.println(Arrays.toString(clear));
        // System.out.println(Arrays.toString(total));
        List<Stage> stgs = new ArrayList<>();

        for(int i = 0 ; i < N ; i++){
            int fail = ((total[i] - clear[i]) * 1000)/total[i];
            stgs.add(new Stage(i+1, fail));
        }
        for (Stage stage : stgs) {
            System.out.println(stage.getIndex() +" " + stage.getFailure());
        }

        List<Stage> new_stgs = stgs.stream()
                                .sorted((stage1, stage2) -> {
                                    return (stage1.getFailure() < stage2.getFailure()) ? stage1.index : stage2.index;
                                })
                                .collect(Collectors.toList());
        System.out.println("----");
        
        for (Stage stage : new_stgs) {
            System.out.println(stage.getIndex() +" " + stage.getFailure());
        }
        return answer;
    }

    public class Stage{
        private int index;
        private int failure;

        public Stage(int index, int failure){
            this.index = index;
            this.failure = failure;
        }
        public int getIndex(){
            return index;
        }

        public int getFailure(){
            return failure;
        }
    }

}
