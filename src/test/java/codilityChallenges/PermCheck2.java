package codilityChallenges;

import java.util.Arrays;

public class PermCheck2 {
    public static void main(String[] args) {
        int[] nums = {1,5,4,4,6,2};
        solution(nums);
    }

    public static int solution(int[] A) {
        int perm = 1;

        Arrays.sort(A);
        if(A[0]!=1){
            perm = 0;
        }
        if(A[A.length-1]!=A.length){
            perm = 0;
        }

        System.out.println(perm);
        return perm;

    }
}
