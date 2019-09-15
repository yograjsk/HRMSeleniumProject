package codilityChallenges;

public class FrogJmp {
    public static void main(String[] args) {
        int[] nums = {81};
        solution(20,10,30);
    }

    public static int solution(int X, int Y, int D) {
        if(X>Y){
            return 0;
        }else if(X<1 || X>1000000000 || Y<1 || Y>1000000000 || D<1 || D>1000000000){
            return 0;
        }
        int jmpCounter=0;
        while(X<Y){
            X=X+D;
            jmpCounter++;
        }
        return jmpCounter;
    }
}
