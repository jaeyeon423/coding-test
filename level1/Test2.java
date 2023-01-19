public class Test2{
    public static void main(String[] args) {
        Test2 test = new Test2();
        test.solution("pPoooyY");
    }   
    boolean solution(String s) {
        boolean answer = true;

        int num_p = 0; //p의 개수
        int num_y = 0; //y의 개수

        for(char word : s.toCharArray()){ //input s를 char type의 배열로 변환하여 for문 돌리기 
            String word_upper = String.valueOf(Character.toUpperCase(word)); //모든 문자를 대문자로 변환
            
            if(word_upper.equals("P")) // 문자가 'P'면 p의 개수 증가
                num_p++;
                if(word_upper.equals("Y")) // 문자가 'Y'면 y의 개수 증가
                num_y++;
        }

        return (num_p == num_y) ? true : false;
    }
}