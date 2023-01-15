package level0;

public class Test31 {
    
    public static void main(String[] args) {
        int answer = 0;
        String my_string = "aAb1B2cC34oOp";
        String[] str_arr = my_string.split("");
        for(String chr : str_arr){
            try{
                int num = Integer.parseInt(chr);
                answer += num;
            }catch(NumberFormatException e){

            }
        }
    }
}
