package hrChallenges;

import java.util.Scanner;

public class Solution14 {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        String[] letters = s.split("");
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
            orderString = orderString + "," + unit;
        }
        String[] order = orderString.split(",");
        java.util.Arrays.sort(order);
        smallest = order[1];
        largest = order[order.length-1];

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