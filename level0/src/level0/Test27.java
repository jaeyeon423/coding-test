package level0;

public class Test27 {
    public static void main(String[] args) {
        int numer1 = 1;
        int denom1 = 2;
        int numer2 = 1; 
        int denom2 = 2;

        int numer;
        int denom;

        if(denom1 == 2 && denom2 == 2){
            numer = numer1+numer2;
            denom = 2;
        }else{
            numer = numer1*denom2 + numer2*denom1;
            denom = denom1 * denom2;
        }


        boolean tmp = true;
        while(tmp){
            tmp = false;
            for(int i = 2 ; i <= numer && i <= denom ; i++){
                if(numer % i == 0 && denom % i == 0){
                    numer /= i;
                    denom /= i;
                    tmp = true;
                }
            }
        }

        System.out.println(numer + " " + denom);

    }
}
