package level0;

public class Test46 {
    public static void main(String[] args) {
        String polynomial = "10x + x";
        String[] p_arr = polynomial.split(" ");

        int var = 0;
        int con = 0;

        for(String num : p_arr){
            if(num.equals("+")){
                // System.out.println("++++++");
            }else if(num.contains("x")){
                if(num.equals("x")){
                    var += 1;
                }else{
                    char[] tmp = num.toCharArray();
                    String word = "";
                    for(char t : tmp){
                        if(Character.isDigit(t)){
                            word += Character.toString(t);
                        }
                    }
                    var += Integer.parseInt(word);
                }
                
            }else{
                con += Integer.parseInt(num);
            }
        }

        System.out.println(var + " " + con);
        String answer = "";
        if(var != 0){
            if(var != 1){
                answer += Integer.toString(var);
            }
            answer += "x";
        }

        if(con != 0){
            if(answer.length() != 0)
                answer += " + ";
            answer += Integer.toString(con);
        }

        System.out.println(answer);
    }
}
