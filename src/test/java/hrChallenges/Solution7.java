package hrChallenges;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) throws ParseException {
        System.out.println();
        if (year < 2000 || year > 3000) {
            return null;
        }

        String dateString = month + " " + day + " " + year;
        Date date = null;
        try {
            date = new SimpleDateFormat("MM dd yyyy").parse(dateString);

        } catch (Exception e) {

        }

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int dayNum = cal.get(Calendar.DAY_OF_WEEK);
        String dayName = "";

        switch (dayNum) {
            case 7:
                dayName = "Saturday".toUpperCase();
                break;
            case 1:
                dayName = "Sunday".toUpperCase();
                break;
            case 2:
                dayName = "Monday".toUpperCase();
                break;
            case 3:
                dayName = "Tuesday".toUpperCase();
                break;
            case 4:
                dayName = "Wednesday".toUpperCase();
                break;
            case 5:
                dayName = "Thursday".toUpperCase();
                break;
            case 6:
                dayName = "Friday".toUpperCase();
                break;

        }


        return dayName;
    }

}

public class Solution7 {
    public static void main(String[] args) throws IOException, ParseException {
//        String output = System.getenv("OUTPUT_PATH");
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int month = Integer.parseInt(firstMultipleInput[0]);
//
//        int day = Integer.parseInt(firstMultipleInput[1]);
//
//        int year = Integer.parseInt(firstMultipleInput[2]);

        int month = 2;
        int day = 13;
        int year = 2010;

        String res = Result.findDay(month, day, year);

//        bufferedWriter.write(res);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
