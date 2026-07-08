class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int x=0;
        int y=(nums.length)/2;
        for(int i=0;i<nums.length;i+=2){
            ans[i]=nums[x];
            ans[i+1]=nums[y];
            x++;
            y++;
        }
        return ans;
    }
}