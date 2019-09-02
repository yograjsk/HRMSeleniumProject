package hrChallenges;

import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.regex.Pattern;

public class Solution15 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        String[] letters = A.split("");
        if(A.length()>50){
            return;
        }else{
            for(String s:letters){
                if(!Pattern.matches("[a-z]", s)){
                    return;
                }
            }
        }

        String[] revLetters = A.trim().split("");
        String[] revOrig = StringUtils.reverse(A).trim().split("");
        int i = 0;
        String isPalindrome = "";
        while(i<A.length()){
            if(revLetters[i].equals(revOrig[i])){
                isPalindrome = "Yes";
            }else{
                isPalindrome = "No";
                break;
            }
            i++;
        }
        System.out.println(isPalindrome);
    }
}