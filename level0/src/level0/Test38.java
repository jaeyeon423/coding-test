package level0;

import java.util.ArrayList;

public class Test38 {
    public static void main(String[] args) {
        String my_string = "We are the world";
        String[] str_arr = my_string.split("");
        ArrayList<String> str_list = new ArrayList<>();   

        for(String word : str_arr){
            if(!str_list.contains(word)) str_list.add(word);
        }
        String answer = "";
        for(String word : str_list){
            answer += word;
        }
    }
}
