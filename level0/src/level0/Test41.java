package level0;

public class Test41 {
    public static void main(String[] args) {
        int[] emergency = {30, 10, 23, 6, 100};
        int[] answer = new int[emergency.length];

        int cnt = 1;
        for(int tmp : emergency){
            int max = 0;
            int index = 0;

            for(int i = 0 ; i < emergency.length; i++){
                if(max < emergency[i]){
                    max = emergency[i];
                    index = i;
                }
            }

            answer[index] = cnt;
            cnt++;
            emergency[index] = 0;

        }

    }
}
