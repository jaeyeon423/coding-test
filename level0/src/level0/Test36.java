package level0;

public class Test36 {
    public static void main(String[] args) {
        int age = 51;
        String answer = "";
        String age_str = Integer.toString(age);
        String[] str_arr = age_str.split("");

        for(String num : str_arr){
            switch (Integer.parseInt(num)){
                case 0:
                    answer += "a";
                    break;
                case 1:
                    answer += "b";
                    break;
                case 2:
                    answer += "c";
                    break;
                case 3:
                    answer += "d";
                    break;
                case 4:
                    answer += "e";
                    break;
                case 5:
                    answer += "f";
                    break;
                case 6:
                    answer += "g";
                    break;
                case 7:
                    answer += "h";
                    break;
                case 8:
                    answer += "i";
                    break;
                case 9:
                    answer += "j";
                    break;
            }
        }
    }
}
