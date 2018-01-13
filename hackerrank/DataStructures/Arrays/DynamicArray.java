import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lastAns = 0;
        int N = scan.nextInt();
        int Q = scan.nextInt();
        int type, x, y, index;
        ArrayList[] seqList = new ArrayList[N];
        
        for(int i = 0; i < seqList.length; i++){
            seqList[i] = new ArrayList<Integer> ();            
        } // populate array with new empty lists
        
        for(int i = 0; i < Q; i++) {
            type = scan.nextInt();
            x = scan.nextInt();
            y = scan.nextInt();
            index = (x^lastAns) % N;
            if(type == 1) {
                seqList[index].add(y);
            }
            else if(type == 2){
                int value = y%(seqList[index].size());
                lastAns = (int) seqList[index].get(value);
                System.out.println(lastAns);
            }
        }
    }
}
