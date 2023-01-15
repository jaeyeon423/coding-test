package level0;

import java.util.ArrayList;
import java.util.Collections;
public class Test20 {
    public static void main(String[] args) {
        
    }
    public String solution(String s) {
        String answer = "";
        String[] s_arr = s.split("");
        ArrayList<String> s_list = new ArrayList<>();
        for(String s1 : s_arr){
            int num = 0;
            for(String s2: s_arr){
                if(s1.equals(s2)){
                    num++;
                }
            }
            
            if(num == 1){
                s_list.add(s1);
                
            }
        }
        Collections.sort(s_list);
        for(String word : s_list){
            answer += word;
        }

        return answer;
    }
}
