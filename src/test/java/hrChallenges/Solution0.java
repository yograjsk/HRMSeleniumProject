package hrChallenges;

import java.util.Scanner;

public class Solution0 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            String newS1 = "";
            String newX = String.valueOf(x);
            int len = s1.length();
            while (s1.length()<15){
                s1 = s1+" ";
            }
            newS1 = s1;
            while(newX.length()<3){
                newX = "0"+newX;
            }
            String finalString = newS1+newX;
            System.out.println(finalString);
        }
        System.out.println("================================");

    }
}



