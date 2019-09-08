package codilityChallenges;

public class sol2 {
    public static void main(String[] args) {
        int[] nums = {1,3,6,4,1,2};
        solution(nums);
    }

    public static int solution(int[] A) {

        int smallestPosNum = 1;
        for(int currNum:A){
            if(currNum>100000 || currNum<1){
                return 0;
            }
            for(int i=1 ; i<=100000 ; i++){
                if(i>currNum){
                    break;
                }
                if(i==currNum){
                    if(currNum-1>smallestPosNum){
                        smallestPosNum = currNum-1;
                    }
                    break;
//                    smallestPosNum = currNum-1;
                }
            }
        }
        return smallestPosNum;
    }
}
