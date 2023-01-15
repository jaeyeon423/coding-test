package level0;

import java.util.Arrays;

public class Test26 {
    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = 2;
        
        int len = num_list.length / n;
        int idx= 0;
        int[][] answer = new int[len][n];
        for(int i = 0 ; i < len ; i++){
            for(int j = 0 ; j < n ; j++){
                answer[i][j] = num_list[idx];
                idx++;
            }
        }

    }
}
