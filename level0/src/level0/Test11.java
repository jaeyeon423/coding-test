package level0;

public class Test11 {
    public static void main(String[] args) {
        Test11 test = new Test11();
        String[] arg1 = {"a", "b", "c"};
        String[] arg2 = {"com", "b", "d", "p", "c"};
        test.solution(arg1, arg2);
    }
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(String s1_word : s1){
            for(String s2_word : s2){
                if(s1_word.equals(s2_word))
                    answer++;
            }
        }
        return answer;
    }
}
