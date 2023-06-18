class norminmax {
    public int findNonMinOrMax(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        if(n==2){
            return -1;
        }
        if(n==1){
            return -1;
        }
        return nums[1];
    }
}
