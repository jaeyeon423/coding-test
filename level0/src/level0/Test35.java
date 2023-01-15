package level0;

public class Test35 {
    public static void main(String[] args) {
        String my_string = "I love you";
        int num1 = 3;
        int num2 = 6;

        String answer = "";

        String[] str_arr = my_string.split("");
        String str_1 = str_arr[num1];
        String str_2 = str_arr[num2];

        str_arr[num1] = str_2;
        str_arr[num2] = str_1;

        for(String word : str_arr){
            answer += word;
        }



    }
}
