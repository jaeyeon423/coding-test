package level0;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 test = new Test1();
		test.runTest();
		
	}
	
	void runTest() {
		String[] args = {"aya", "yee", "u", "maa", "wyeoo"};
		solution(args);
	}
	
	public int solution(String[] babbling) {
		int answer = 0;
		
		String[] originalBabList = {"aya", "ye", "woo", "ma"};
		String[] repeatBabList = {"ayaaya", "yeye", "woowoo", "mama"};
		
		for(String bab : babbling) {
			for(String rBab : repeatBabList) {
				bab = bab.replace(rBab, "X");
			}
			
			for(String oBab : originalBabList) {
				bab = bab.replace(oBab, "?");
			}
			int sign = 0;
			for(int i = 0 ; i < bab.length(); i++) {
				if(!bab.subSequence(i, i+1).equals("?")) {
					sign = 1;
					break;
				}
			}
			
			System.out.println(bab);
			
			if(sign == 0) {
				answer++;
			}
		}
        
        return answer;
    }

}