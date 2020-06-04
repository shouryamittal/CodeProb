/**Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array. */
class MajorElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0 ; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                int freq = map.get(nums[i]);
                freq += 1;
                map.put(nums[i], freq);
            }
            else {
                map.put(nums[i], 1);
            }
        }
    
        int major = 0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            int val = entry.getValue();
            if( val > (nums.length / 2)) {
                major = entry.getKey();
                break;
            }
        }
        
        return major;
    }

    public static void main(String ...s) {
        MajorElement m = new MajorElement();
        System.out.println(m.majorityElement([2,3,2,3,4,2,2,4]));
    }
}