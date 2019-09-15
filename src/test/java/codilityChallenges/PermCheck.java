package codilityChallenges;

import java.util.Arrays;

public class PermCheck {
    public static void main(String[] args) {
        int[] nums = {3,5,1,4,6,2,3};
        solution(nums);
    }

    public static int solution(int[] A) {
        int perm = 1;

        Arrays.sort(A);
        for(int i=0;i<A.length-1;i++){
            if(A[i]<1 || A[i]>1000000000){
                return 0;
            }else if(A.length>100000){
                return 0;
            }else if(A[0]!=1){
                return 0;
            }

            if(A[i+1]-A[i]!=1){
                perm = 0;
                break;
            }
        }
        if(A.length==1){
            if(A[0]==1)
                perm = 1;
            else
                perm = 0;
    }
        return perm;

        // write your code in Java SE 8
    }
}
