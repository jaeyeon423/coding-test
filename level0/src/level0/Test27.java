package level0;

import java.util.ArrayList;

public class Test27 {
    public static void main(String[] args) {
        int numer1 = 9;
        int denom1 = 2;
        int numer2 = 1; 
        int denom2 = 3;

        int numer = numer1*denom2 + numer2*denom1;
        int denom = denom1 * denom2;

        ArrayList<Integer> list = new ArrayList<>();


        for(int i = 1 ; i < numer && i < denom ; i++){
            if(numer % i == 0 && denom % i == 0){
                list.add(i);
            }
        }

        for(int a : list){
            numer /= a;
            denom /= a;
        }

        System.out.println(numer + " " + denom);

    }
}
