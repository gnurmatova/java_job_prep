import java.util.Arrays;

class ListNode {
	 int val;
	 ListNode next;
	 ListNode(int x) { val = x; }
}
class Solution {
	
	 public int removeDuplicates(int[] nums) {
	        int len = 0;
	        int cur = nums[0];
	        int cur_ind = 0;
	        for(int i =1; i < nums.length; ++i){
	            if(nums[i] != cur){
	                len+=1;
	                cur = nums[i];
	                cur_ind +=1;
	                System.out.println(nums[cur_ind]=cur);
	            }
	        }
	        Arrays.copyOfRange(nums, 0, len);
	        return len + 1;
	    }
    
    public static void main(String[] args) {
    		Solution s = new Solution();
    		s.removeDuplicates(new int[] {1,1,1,2,2,3,3,3,4,5,6});
    }
}