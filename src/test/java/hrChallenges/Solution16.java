package hrChallenges;

import java.util.Scanner;

public class Solution16 {

    static boolean isAnagram(String a, String b) {
        if(a.length()>50 || b.length()>50 || a.length()<1 || b.length()<1 || a.length() != b.length()){
            return false;
        }
        String[] arraya = a.trim().toLowerCase().split("");
        String[] arrayb = b.trim().toLowerCase().split("");

        java.util.Arrays.sort(arraya);
        java.util.Arrays.sort(arrayb);
        int i=0;
        while(i<a.length()){
            boolean check1 = !java.util.regex.Pattern.matches("[a-z]", arraya[i]);
            boolean check2 = !java.util.regex.Pattern.matches("[a-z]", arrayb[i]);
            boolean check3 = !arraya[i].equalsIgnoreCase(arrayb[i]);
            if(check1 || check2 || check3){
                return false;
            }else{
                i++;
            }
        }
            return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
