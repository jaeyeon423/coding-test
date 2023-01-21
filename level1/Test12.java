import java.util.Arrays;

public class Test12 {
    public static void main(String[] args) {
        Test12 test = new Test12();
        test.solution("try hello world");
    }

    public String solution(String s) {
        String answer = "";

        String[] s_arr = s.split("");

        System.out.println(Arrays.toString(s_arr));

        int start = 0;
        for(String word : s_arr){
            if(word.equals(" ")){
                answer += " ";
                start = 0;
            }else{
                if(start % 2 == 0){
                    answer += word.toUpperCase();
                }else{
                    answer += word.toLowerCase();
                }
                start++;
            }
        }

        System.out.println(answer);
        
        return answer;
    }
}
