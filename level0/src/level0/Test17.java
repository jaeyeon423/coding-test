package level0;

public class Test17 {
    public String solution(String my_string, String letter) {
        String answer = "";
        String[] str_arr = my_string.split("");
        for(String word : str_arr){
            if(word.equals(letter)){
                word = "";
            }
            answer += word;
        }
        
        return answer;
    }
}
