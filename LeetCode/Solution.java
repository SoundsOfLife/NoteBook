import java.util.*;
import java.lang.*;
import javafx.util.Pair;

public class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int ans = 0;
        int num = nums1.length + nums2.length;
        if(num % 2 == 0){
            int mid = num / 2;
        }else{
            int low = num / 2,high = num / 2 + 1;
        }
        return ans;
    }

    public int binarySearch(int[] nums,int x,int left,int right){

        int ans = 0;
        return ans;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
            return null;
        ListNode tempA = headA;
        ListNode tempB = headB;
        while(tempA.next != null)
            tempA = tempA.next;
        while(tempB.next != null)
            tempB = tempB.next;
        if(tempA!=tempB)
            return null;
        else{
            tempA = headA;
            tempB = headB;
            while(tempA != tempB){
                tempA = tempA.next == null?headA:tempA.next;
                tempA = tempA.next == null?headA:tempA.next;
                tempB = tempB.next == null?headA:tempB.next;
            }
            tempA = headB;
            while(tempA != tempB){
                tempA = tempA.next == null?headA:tempA.next;
                tempB = tempB.next == null?headA:tempB.next;
            }
            return tempA;
        }
    }

    public static void main(String[] args) {
        int[][] temp = {{0,1,-1},{1,0,-1},{1,1,1}};
        Solution s = new Solution();
        Pair<Integer,Integer[][]> ans = s.cherryPickup(temp);
        System.out.print(ans);
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}