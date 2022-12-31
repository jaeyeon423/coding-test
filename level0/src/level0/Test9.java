package level0;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test9 test = new Test9();
		test.solution("ab6CDE443fgh22iJKlmn1o", "6CD");
	}
	
	public int solution(String str1, String str2) {
        int answer = 0;
        
        return str1.contains(str2)? 1 : 2;
    }

}
