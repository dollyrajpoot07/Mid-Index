// Mid Index
// You are given an array of length n. Find and print the element at mid index of arr.
// Ignore all the indices at which negative numbers are present in array.

// Input 1:
// 6
// 12 -3 14 -56 77 13
// Output 1:
// 14

// Input 2:
// 6
// 11 23 -3 3 -5 -32
// Output 2:
// 23
import java.util.*;

class MidIndex {
    public static Integer findMiddleIndex(int[] arr) {
      ArrayList<Integer> newArr = new ArrayList<Integer>();
     
      for (int x : arr) {
        if (x >= 0) {
          newArr.add(x);
        }
      }

        int mid = (newArr.size() - 1)/2;
        return newArr.get(mid >=0 ? mid : 0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = findMiddleIndex(arr);
        System.out.println(result);
        sc.close();
    }
}