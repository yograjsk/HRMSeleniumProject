package codilityChallenges;

import java.util.ArrayList;
import java.util.Arrays;

public class sol2_4 {
    public static void main(String[] args) {
        int[] nums = {1, -10, 0, 3, 6};
        solution(nums);
    }

    public static int solution(int[] A) {

        int smallestPosNumber = 0;
        boolean found = false;
        Arrays.sort(A);
        for (int i = 0; i < A.length - 1; i++) {
            int a = A[i];
            int b = A[i + 1];
            if (b - a > 1 && b>1) {
                found = true;
                smallestPosNumber = a + 1;
                break;
            }
        }
        if (found == false) {
            smallestPosNumber = A[A.length - 1] + 1;
        }

        if (smallestPosNumber < 1 || (A.length==1 && A[0]>1)) {
            smallestPosNumber = 1;
        }

        System.out.println(smallestPosNumber);
        return smallestPosNumber;
    }
}
