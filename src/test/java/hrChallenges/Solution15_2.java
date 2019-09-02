package hrChallenges;


import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution15_2 {

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
        int i=0;
        String isPal = "";
        while(i<A.length()){
            if(letters[i].equals(letters[A.length()-(i+1)])){
                isPal = "Yes";
            }else{
                isPal = "No";
                break;
            }
            i++;
        }

        System.out.println(isPal);
    }
}