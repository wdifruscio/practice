class Solution {
    public String reverseString(String s) {
        if(s.length() <= 1) return s;
        return reverseString(s.substring(1)) + s.charAt(0);
    }

    public String reverseStringTwo(String s) {
        if(s.length() <= 1) return s;
        return reverseString(s.substring(1)) + s.charAt(0);
    }
}

