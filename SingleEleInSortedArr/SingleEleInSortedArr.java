//You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once. Find this single element that appears only once.

class SingleEleInSortedArr {
    public int singleNonDuplicate(int[] nums) {
        int i = 0;
        int ele = 0;
        while(i < nums.length) {
            if(i == nums.length - 1) {
                ele = nums[i];
                break;
            }
            else if(nums[i] - nums[i + 1] == 0){
                    i = i + 2;
            }
            else {
                ele = nums[i];
                break;
            }
        }
        
        return ele;
    }

    public static void main(String ...s) {
        SingleEleInSortedArr s = new SingleEleInSortedArr();
        s.singleNonDuplicate([1,1,2,3,3]);
    }
}