package level0;

import java.util.Arrays;

public class Test13{
    public static void main(String[] args) {
        Test13 test = new Test13();
        int[] args_arr = {149, 180, 192, 170};
        System.out.println(test.solution(args_arr, 140));
    }

    public int solution(int[] array, int height) {
        int answer = 0;
        Arrays.sort(array);

        int[] num_arr = new int[array.length];
        for(int i = 0 ; i < array.length; i++){
            num_arr[array.length-i-1    ] = array[i];
        }
        boolean tmp = true;
        for(int i = 0 ; i < array.length; i++){
            // System.out.println(num_arr[i] +" "+height);
            if(num_arr[i] < height){
                tmp = false;
                answer = i;
                break;
            }
        }
        if(tmp)
            answer = array.length;
        return answer;
    }
}