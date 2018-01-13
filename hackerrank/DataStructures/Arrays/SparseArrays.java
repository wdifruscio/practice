import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int amt = input.nextInt();
        int count = 0;
        List<String> strs = new ArrayList<String>();
        while(input.hasNext() && count < amt) {
            strs.add(input.next());
            count++;
        }
        amt = input.nextInt();
        count = 0;
        while(input.hasNext() && count < amt) {
            int score = 0;
            String str = input.next();
            for(String s : strs) {
                if(s.equals(str)) {
                    score++;
                }
            }
            System.out.println(score);
            count++;
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
