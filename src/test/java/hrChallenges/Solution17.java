package hrChallenges;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class Solution17 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        if(s.length()>400000){
            return;
        }
        if(s.trim().contentEquals("")){
            System.out.println("0");
            return;
        }

        String[] letters = s.trim().split("");
        for(String s1:letters){
            if(!java.util.regex.Pattern.matches("[A-Za-z| |!|,|?|.|_|'|@|[|]]", s1)){
                return;
            }
        }

//        String newStr1 = s.replaceAll("[ |!|,|?|.|_|'|@|[|]]"," ");
//        String newStr = newStr1.replaceAll("\\s+"," ");
//        String[] words = newStr.split(" ");
        String[] words = s.trim().replaceAll("[ |!|,|?|.|_|'|@|[|]]"," ").replaceAll("\\s+"," ").split(" ");
        System.out.println(words.length);
        for(String s2:words){
            System.out.println(s2);
        }
        scan.close();
    }
}

