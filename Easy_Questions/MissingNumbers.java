/*
 *Input : 1 2 4 8 9 11 12 14
 *Output : 3 5 6 7 10 13
*/

import java.util.HashSet;
import java.util.Scanner;
import java.util.ArrayList;
public class MissingNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        // Get the maximum and minimum.
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        HashSet<Integer> st = new HashSet<Integer>();
        for(int i = 0; i < n; i++){
            maxNum = Math.max(maxNum, nums[i]);
            minNum = Math.min(minNum, nums[i]);
            st.add(nums[i]);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = minNum; i <= maxNum; i++){
            if(!st.contains(i)){
                res.add(i);
            }
        }

        System.out.println(res.toString());
        sc.close();
    }
}
