/**
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".
 */

class Solution {
    public int numJewelsInStones(String J, String S) {
        char search;
        int out = 0;
        for(int i = 0; i < J.length(); i ++) {
            search = J.charAt(i);
            for(int j = 0; j < S.length(); j++) {
                if(S.charAt(j) == search) {
                    out++;
                }
            }
        }
        return out;
    }

    public int numJewelsInStones2(String J, String S) {
        HashSet set = new HashSet<Character>();
        int out = 0;
        for(int i = 0; i < J.length(); i++) {
            set.add(J.charAt(i));
        }
        for(int j = 0; j < S.length(); j++) {
            if(set.contains(S.charAt(j))) {
                out++;
            }
        }
    return out;
    }
}
