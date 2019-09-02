package hrChallenges;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Solution14_2 {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        SortedSet<String> ord = new TreeSet<>();
        if(s.length()<1 || s.length()>1000){
            return "";
        }
        for(String s1:s.split("")){
            int ascii = s1.charAt(0);
            if(!(ascii>=65 && ascii<=90) && !(ascii>=97 && ascii<=122)){
                return "";
            }
        }
        String orderString = "";
        int start = 0;
        int length = s.length();
        while((start+k-1)<length){
            String unit = s.substring(start++, start+k-1);
            ord.add(unit);
        }
        smallest = ord.first();
        largest = ord.last();

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}