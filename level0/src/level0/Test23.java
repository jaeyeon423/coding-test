package level0;

import java.util.ArrayList;

public class Test23 {
    public static void main(String[] args) {
        String input = "3x + 7 + x";
        Test23 test23 = new Test23();
        test23.solution(input);
    }

    public String solution(String polynomial) {
        String answer = "";
        ArrayList<String> str_list = new ArrayList<>();
        String[] str_arr = polynomial.split(" "); 
        int pre_var = 0;
        int cons = 0;
        for(String word : str_arr){
            if(word.equals("+"))
                continue;
            if(word.length() > 1){
                pre_var += Integer.parseInt(word.split("")[0]);
            }else{
                if(word.equals("x")){
                    pre_var += 1;
                }else{
                    cons += Integer.parseInt(word);
                }
            }
        }
        
        return answer;
    }
}
