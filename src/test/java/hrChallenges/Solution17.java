package hrChallenges;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class Solution17 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
//        String[] splits = s.split("[A-Za-z| |!|,|?|.|_|'|@]");
        String[] splits = s.split("");
        for(String s1:splits){
            if(!Pattern.matches("[A-Za-z| |!|,|?|.|_|'|@|[|]]", s1)){
                return;
            }
        }
        // Write your code here.
        scan.close();
    }
}

