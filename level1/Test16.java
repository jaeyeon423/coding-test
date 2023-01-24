import java.util.Arrays;

public class Test16 {
    public static void main(String[] args) {
        Test16 test = new Test16();
        int[][] input_arr = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};

        test.solution(input_arr);   
    }
    public int solution(int[][] sizes) {
        int answer = 0;

        int width = Integer.MIN_VALUE;
        int height = Integer.MIN_VALUE;
        for(int[] size : sizes){
            Arrays.sort(size);
            
            width = Math.max(width, size[0]);
            height = Math.max(height, size[1]);

        }

        answer = width * height;

        // System.out.println(answer);

        return answer;
    }
}
