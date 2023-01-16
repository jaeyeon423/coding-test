package level0;

import java.util.ArrayList;

public class Test47 {
    public static void main(String[] args) {
        String bin1 = "0";
        String bin2 = "0";

        String[] bin1_arr = bin1.split("");
        String[] bin2_arr = bin2.split("");

        int bin1_10 = 0;
        int multi = 1;
        for(int i = bin1.length()-1 ; i >= 0 ; i--){
            bin1_10 += multi * Integer.parseInt(bin1_arr[i]);
            multi *= 2;

        }

        int bin2_10 = 0;
        multi = 1;
        for(int i = bin2.length()-1 ; i >= 0 ; i--){
            bin2_10 += multi * Integer.parseInt(bin2_arr[i]);
            multi *= 2;
        }

        int bin = bin1_10 + bin2_10;

        ArrayList<String> s_list = new ArrayList<>();
        while(bin>0){
            s_list.add(0, Integer.toString(bin%2));
            bin /= 2;    
        }

        String answer = "";
        for(String s : s_list){
            answer += s;
        }
        
        System.out.println(s_list);
        

    }
}   
