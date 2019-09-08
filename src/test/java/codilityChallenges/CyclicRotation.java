package codilityChallenges;

import java.util.ArrayList;

public class CyclicRotation {
    public static void main(String[] args) {
        int[] nums = {81};
        solution(nums,20);
    }

    public static int[] solution(int[] A, int K) {
        int[] fa = new int[0];
        if(A.length>100){
            return null;
        }
        for (int loop = 0; loop < K; loop++) {
        fa = new int[A.length];
            for (int i = 0; i < A.length; i++) {
//                if(A[i]<-1000 || A[i]>1000){
//                    return null;
//                }
                fa[i] = A[Math.floorMod(A.length - 1 + i, A.length)];
            }
            A = fa;
        }
        return A;
    }
}
