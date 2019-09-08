package codilityChallenges;

import java.util.ArrayList;
import java.util.Arrays;

public class sol3 {
    public static void main(String[] args) {
        int[] nums = {9};
        solution(nums);
    }

    public static int solution(int[] A) {
        if(Math.floorMod(A.length,2)==0){
            return 0;
        }

        int oddValue = 0;
        int length = A.length;
        int odd = A[0];
        int ev = A[1];
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();

        for (int x = 0; x < A.length ; x++) {
            if(A[x]>1000000000){
                continue;
            }
            if(A[x] == odd){
                a.add(A[x]);
            }else if(A[x] == ev){
                b.add(A[x]);
            }else{
                c.add(A[x]);
            }
        }
        if(a.size()==1 ){
            oddValue = a.get(0);
        }else if(b.size()==1 ){
            oddValue = b.get(0);
        }else if(c.size()==1 ){
            oddValue = c.get(0);
        }

        System.out.println(oddValue);
        return oddValue;
    }
}
