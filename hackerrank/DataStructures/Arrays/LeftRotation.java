public class Solution {
    public static void main(String[] args) {
        int[] test = { 1, 2, 3, 4, 5 };
	System.out.println("before rotation");
	for(int i : test) {
		System.out.println(i);
	}
	test = leftRotation(test, 2);
	System.out.println("after rotation \n");
	for(int i : test) {
		System.out.println(i);
	}

    }
    static int[] leftRotation(int[] arr, int d) {
	int result[] = new int[arr.length];
	for(int i = 0; i < arr.length; i++) {
	    result[(i+(arr.length - d)) % arr.length] = arr[i];
	}
	return arr;
    }
}


