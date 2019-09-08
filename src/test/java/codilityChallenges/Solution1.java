package codilityChallenges;


public class Solution1 {

    public static void main(String[] args) {
        System.out.println(solution(5));
    }

    public static int solution(int N){
        int gap = 0;

        if(N>2147483647 || N<1)
            return 0;
        String bin = Integer.toBinaryString(N);
        String[] gaps = bin.split("1");
        if(N==1){
            return 1;
        }else if(gaps.length == 0){
            return 0;
        }
        if(!bin.substring(bin.length()-1).contentEquals("1")){
            gaps[gaps.length-1] = "";
        }
        int maxGap = 0;
        for(String s:gaps){
            if(s.length()>maxGap)
                maxGap = s.length();
        }
        return maxGap;
    }
}
