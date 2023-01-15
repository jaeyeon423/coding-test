package level0;

import java.util.Arrays;

public class Test28 {
    public static void main(String[] args) {
        int[] array = {1,1,2,2};

        Arrays.sort(array);

        int max = array[array.length-1];

        int[] idx_arr = new int[max+1];

        for(int num : array){
            idx_arr[num]++;
        }

        int answer = 0;
        int total = 0;
        boolean multi = false;
        for(int i = 0 ; i < max+1 ; i++){
            if(total == idx_arr[i]){
                multi = true;
            }
            if(total < idx_arr[i] ){
                multi = false;
                answer = i;
                total = idx_arr[i];
            }
        }
        if(multi){
            answer = -1;
        }
    }
}
