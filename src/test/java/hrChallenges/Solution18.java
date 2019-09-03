package hrChallenges;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution18 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        String[] patterns = new String[testCases];
        int i = 0;
        while(i < testCases) {
            patterns[i++] = in.nextLine();
        }
        for(String s:patterns){
            try{
                Pattern.matches(s,"");
                System.out.println("Valid");
            }catch (Exception e){
                System.out.println("Invalid");
            }
        }
    }
}

