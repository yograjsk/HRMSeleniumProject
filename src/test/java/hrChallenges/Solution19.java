package hrChallenges;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution19 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        BigInteger b1 = in.nextBigInteger();
        BigInteger b2 = in.nextBigInteger();

        String b1Str = String.valueOf(b1);
        String b2Str = String.valueOf(b2);

        if(b1Str.length()>200 || b2Str.length()>200 || b1.signum()==-1 || b2.signum()==-1){
            return;
        }
        System.out.println(b1.add(b2));
        System.out.println(b1.multiply(b2));
    }
}

