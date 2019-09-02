package hrChallenges;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        for(String s:S.split("")){
            if(!Pattern.matches("[a-zA-Z]",s)){
                return;
            }
        }
        if(S.length()<1 || S.length()>100){
            return;
        }else if(start<0 || start>=end || end>S.length()){
            return;
        }
        System.out.println(S.substring(start, end));
    }
}

