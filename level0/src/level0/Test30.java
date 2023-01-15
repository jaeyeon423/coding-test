package level0;

public class Test30 {
    public static void main(String[] args) {
        int a = 6;
        int b = 10;

        int ans = lcm(a,b);
        System.out.println(ans/6);
    }

    static int gdc(int a, int b) { //최대 공약수
		if(a<b) // 유클리드 호제법 조건
		{
			int temp = a;
			a = b;
			b = temp;
		}
		while(b!=0) { // 유클리드 호제법
			int r=a%b;
			a=b;
			b=r;
		}
		return a;
	}
	
	static int lcm(int a, int b) { //최소 공배수
		return a*b / gdc(a,b);
	}
    
}
