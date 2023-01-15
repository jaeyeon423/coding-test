package level0;

public class Test39 {
    public static void main(String[] args) {
        int i = 10; 
        int j = 50;
        int k = 5;

        String check_num = Integer.toString(k);
        int answer = 0;
        for(int num = i ; num <= j ; num++){
            System.out.println("===" + num + "===");
            String num_str = Integer.toString(num);
            String[] str_arr = num_str.split("");
            for(String word : str_arr){
                System.out.print(word+" ");
                if(word.equals(check_num)){
                    answer++;
                }
            }
        }
    }
}
