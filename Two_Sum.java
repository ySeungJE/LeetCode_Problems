package Leet_Code;

class Tow_Sum {
    public int[] twoSum(int[] nums, int target) {
        int[] test = {};
        boolean end = false;
        for(int i=0; i<nums.length; i++) {
            if(end==true) break;
            test = new int[2];
            test[0] = i;
            
            for(int j=0; j<nums.length; j++) {
                if((i!=j)&&nums[j]==target-nums[i]) {
                    test[1]=j; end = true;
                }
                if(end==true) break;
            }
        }
        return test;
    }
}
