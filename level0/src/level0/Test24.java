package level0;

import java.util.Arrays;

public class Test24 {
    public static void main(String[] args) {
        String before = "hello";
        String after = "hello";


        String[] b_arr = before.split("");
        Arrays.sort(b_arr);

        String[] a_arr = after.split("");
        Arrays.sort(a_arr);


        if(Arrays.equals(b_arr, a_arr)){
            
        }else{
            
        }
        
        
    }
}
