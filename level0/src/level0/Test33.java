package level0;

import java.util.ArrayList;
import java.util.Arrays;

public class Test33 {
    public static void main(String[] args) {
        String my_String = "hi12392";

        ArrayList<Integer> int_list = new ArrayList<>();

        String[] str_arr = my_String.split("");

        for(String str : str_arr){
            try{
                int_list.add(Integer.parseInt(str));
            }catch(NumberFormatException e){

            }
        }
        int[] answer = new int[int_list.size()];
        int index =0;
        for(int num : int_list){
            answer[index++] = num;
        }

        Arrays.sort(answer);
    }
}
