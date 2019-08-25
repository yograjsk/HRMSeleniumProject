package hrChallenges;

import java.util.*;
import java.io.*;

class Solution2{
    public static void main(String []arg){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            if(a>50 || b>50 || n>15 || n<0 || a<0 || b<0 || t<0 || t>500){
                return;
            }

            int counter=0;
            int result = a;
            while(counter<n){
                result = (int) (result + (Math.pow(2, counter)*b));
                System.out.print(result + " ");
                counter++;
            }
            System.out.println("");
        }
        in.close();
    }
}

