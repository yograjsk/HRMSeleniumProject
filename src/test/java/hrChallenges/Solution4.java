package hrChallenges;

import java.util.Scanner;


class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        for(int i=1;i<=3;i++){
        for(int i=1;sc.hasNext()==true;i++){
            String input = sc.nextLine();
            System.out.println(i+" "+input);
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}



