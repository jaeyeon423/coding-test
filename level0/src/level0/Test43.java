package level0;

import java.util.Arrays;

public class Test43 {
    public static void main(String[] args) {
        int[] numlist = {1, 2, 3, 4, 5, 6};
        int n = 4;


        Arrays.sort(numlist);
        int[] answer = new int[numlist.length];

        int index = 0;
        for(int tmp : numlist){
            int min = Integer.MAX_VALUE;
            int idx = 0;
            for(int i = 0 ; i < numlist.length ; i++){
                if(min >= Math.abs((n - numlist[i]))){
                    min = Math.abs((n - numlist[i]));
                    idx = i;
                }
            }

            answer[index] = numlist[idx];
            index++;
            numlist[idx] = Integer.MAX_VALUE;
        }


    }
}
