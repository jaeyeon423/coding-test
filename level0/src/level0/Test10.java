package level0;

public class Test10 {
    public static void main(String[] args) {
        Test10 test =  new Test10();
        String[] arg = {"3 - 4 = -3", "5 + 6 = 11"};
        test.solution(arg);
    }

    public String[] solution(String[] quizs) {
        String[] answer = new String[quizs.length];

        for(int i = 0 ; i < quizs.length; i++){
            String quiz = quizs[i];
            String[] tmp = quiz.split("= ");
            String left = tmp[0];
            String right = tmp[1];

            String[] left_words = left.split(" ");
            
            int result = Integer.parseInt(right);
            int left_1 = Integer.parseInt(left_words[0]);
            int left_2 = Integer.parseInt(left_words[2]);

            int ans;
            if(left_words[1].equals("+")){
                ans = left_1 + left_2;
            }else{
                ans = left_1 - left_2;
            }

            if(ans == result){
                answer[i] = "O";
            }else{
                answer[i] = "X";
            }
        }
        return answer;
    }
    
}
