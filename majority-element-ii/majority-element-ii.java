class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();

        int firstMajor = 0,  secondMajor = 0, firstSum = 0, secondSum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == firstMajor) {
                firstSum++;
            } else if (nums[i] == secondMajor) {
                secondSum++;
            } else if (firstSum == 0) {
                firstMajor = nums[i];
                firstSum = 1;
            } else if (secondSum == 0) {
                secondMajor = nums[i];
                secondSum = 1;
            } else {
                firstSum--;
                secondSum--;
            }
        }

        firstSum = 0;
        secondSum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == firstMajor) {
                firstSum++;
            } else if (nums[i] == secondMajor) {
                secondSum++;
            }
        }

        if (firstSum > nums.length/3) {
            result.add(firstMajor);
        } 
        
        if (secondSum > nums.length/3) {
            result.add(secondMajor);
        }

        return result;
    }
}