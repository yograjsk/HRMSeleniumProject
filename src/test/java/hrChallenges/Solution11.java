package hrChallenges;

import java.io.*;
import java.security.*;


public class Solution11 {

    public static void main(String[] args) throws Exception {
        DoNotTerminate1.forbidExit();

        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine().trim());
            Object o = new Inner().new Private();// Must be used to hold the reference of the instance of the class Solution.Inner.Private
            System.out.println(num + " is " +((Solution11.Inner.Private)o).powerof2(num));


            System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");

        }//end of try

        catch (DoNotTerminate1.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }//end of main
    static class Inner{
        private class Private{
            private String powerof2(int num){
                return ((num&num-1)==0)?"power of 2":"not a power of 2";
            }
        }
    }//end of Inner

}//end of Solution

class DoNotTerminate1 { //This class prevents exit(0)

    public static class ExitTrappedException extends SecurityException {

        private static final long serialVersionUID = 1L;
    }

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}

