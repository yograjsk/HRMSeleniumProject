package codilityChallenges;

public class sol2_3 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        solution(nums);
    }

    public static int solution(int[] A) {
        int finNum = 1;
        int maxNum = 1;
        int minNum = 1;
        for(int num:A){
            if(num>maxNum){
                if(maxNum<=100000){
                maxNum = num;
                }
            }else if(num<minNum && num>0){
                minNum = num;
            }
        }
        int b1 = maxNum-1;
        int b2 = maxNum+1;
        for(int num:A){
            if(b1 == num){
                finNum = b2;
            }
        }
        System.out.println(minNum);
        System.out.println(maxNum);
        System.out.println(finNum);
        return finNum;
    }
}
