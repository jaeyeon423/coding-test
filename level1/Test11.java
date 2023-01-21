import java.util.Arrays;

public class Test11 {
    public static void main(String[] args) {
        Test11 test = new Test11();
        int[][] arr1 = {{1}, {2}};
        int[][] arr2 = {{3}, {5}};
        test.solution(arr1, arr2);
    }

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = arr1.clone();

        System.out.println(arr1[0].length);
        System.out.println(arr1.length);

        for(int i = 0 ; i < arr1.length; i++){
            
            for(int j = 0 ; j < arr1[0].length; j++){
                System.out.println(j);
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println(Arrays.toString(answer[0])+" " +Arrays.toString(answer[1]));
        return answer;
    }
}
